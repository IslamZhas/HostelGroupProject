import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String connectionUrl = "jdbc:postgresql://localhost:5432/Hostel";
        Connection con = null;
        ResultSet rs = null;
        Statement statement = null;
        try{
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connectionUrl, "postgres", "Aa1234");
            statement = con.createStatement();
            rs = statement.executeQuery("select * from users");
            while(rs.next()){
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getInt("age") + " " + rs.getString("address"));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            try{
                rs.close();
                statement.close();
                con.close();
            } catch (SQLException throwables){
                throwables.printStackTrace();
            }
        }
    }
}
