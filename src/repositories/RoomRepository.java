package repositories;

import data.IDB;
import entity.Room;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class RoomRepository implements RoomsRepository {
    private final IDB db;
    public RoomRepository(IDB db){
        this.db = db;
    }

}
public Room getRoom(int id){
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT id, roomNumber, numberOfBeds, type";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                Room room = new Room(rs.getInt("id"), rs.getInt("roomNumber"), rs.getInt("numberOfBeds"), rs.getString("type"));
                return room;
            }
        } catch (SQLException throwables){
            throwables.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }finally {
            try {
                con.close();
            }catch (SQLException throwables){
                throwables.printStackTrace();
            }
        }
        return null;
    }
