import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Hostel {
    private ArrayList<Room> rooms;
    private String name;
    private String location;
    private int totalRooms;
    public Hostel(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(int totalRooms) {
        this.totalRooms = totalRooms;
    }
    public ArrayList<Room> showRooms(Connection connection){
        ArrayList<Room> rooms = new ArrayList<Room>();
        try{
            Statement stm =connection.createStatement();
            ResultSet rs=stm.executeQuery("SELECT * FROM Room");
            while(rs.next()){
                int id = rs.getInt("id");
                int roomNumber = rs.getInt("roomNumber");
                int numberOfBeds = rs.getInt("numberOfBeds");
                String type = rs.getString("type");
                rooms.add(new Room(id, roomNumber, numberOfBeds, type));
        }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
        return rooms;
    }
}
