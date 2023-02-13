import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String connectionUrl = "jdbc:postgresql://localhost:5432/Hostel";
        Class.forName("org.postgresql.Driver");
        Connection cn =DriverManager.getConnection(connectionUrl, "postgres", "Qqwerty1!");

    }
}
