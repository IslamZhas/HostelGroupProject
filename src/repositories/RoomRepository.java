package repositories;

import data.IDB;
import entity.Room;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class RoomRepository implements RoomsRepository {
    private final IDB db;

    public RoomRepository(IDB db) {
        this.db = db;
    }

    public List<Room> getAllRooms() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT id,name,rnum,numbeds,cost,booked,availablebeds FROM rooms";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Room> rooms = new LinkedList<>();
            while (rs.next()) {
                Room room = new Room(rs.getInt("id"), rs.getString("name"), rs.getInt("rnum"), rs.getInt("numbeds"), rs.getInt("cost"), rs.getBoolean("booked"), rs.getInt("availablebeds"));
                rooms.add(room);
            }
            return rooms;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }
    public Room getRoom(int id) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT id,name,rnum,numbeds,cost,booked,availablebeds FROM rooms WHERE id=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, id);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Room room = new Room(rs.getInt("id"), rs.getString("name"), rs.getInt("rnum"), rs.getInt("numbeds"), rs.getInt("cost"), rs.getBoolean("booked"), rs.getInt("avaiilablebeds"));
                String updateSql = "UPDATE rooms SET booked = true WHERE id = ?";
                PreparedStatement updateSt = con.prepareStatement(updateSql);
                updateSt.setInt(1, id);
                updateSt.executeUpdate();

                return room;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }
    public List<Room> getAllAvailableRooms() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT id,name,rnum,numbeds,cost,booked,availablebeds FROM rooms WHERE booked = false";
            Statement st1 = con.createStatement();
            ResultSet rs1 = st1.executeQuery(sql);
            List<Room> rooms1 = new LinkedList<>();
            while (rs1.next()) {
                Room room1 = new Room(rs1.getInt("id"), rs1.getString("name"), rs1.getInt("rnum"), rs1.getInt("numbeds"), rs1.getInt("cost"), rs1.getBoolean("booked"), rs1.getInt("availablebeds"));
                rooms1.add(room1);
            }
            return rooms1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }
}
