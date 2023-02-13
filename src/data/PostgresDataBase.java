package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresDataBase implements IDB{
    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String connectionUrl = "jdbc:postgresql://localhost:5432/Hostel";
        try{
            Class.forName("org.postgresql.Driver");
            Connection cn = DriverManager.getConnection(connectionUrl, "postgres", "Aa1234");
            return cn;
        } catch(Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
