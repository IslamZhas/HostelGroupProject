import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String connectionUrl = "jdbc:postgresql://localhost:5432/Hostel";
        Class.forName("org.postgresql.Driver");
        Connection cn =DriverManager.getConnection(connectionUrl, "postgres", "Qqwerty1!");
        Hostel hostel = new Hostel();
        Payment payment = new Payment();
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        while(run){
            System.out.printf("Hello, Welcome to our Hostel");
            System.out.println("Choose the options to make a banking");
            System.out.println("1)I want to bank room");
            System.out.println("2)I want to delete place from the banking");
            System.out.println("3)I want to cancel the banking");
        }
    }
}
