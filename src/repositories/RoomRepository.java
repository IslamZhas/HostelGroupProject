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
            String sql = "SELECT id, roomNumber, numberOfBeds, type";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Room> rooms = new LinkedList<>();
            while (rs.next()) {
                Room room = new Room(rs.getInt("id"), rs.getInt("roomNumber"), rs.getInt("numberOfBeds"), rs.getString("type"));
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
}
