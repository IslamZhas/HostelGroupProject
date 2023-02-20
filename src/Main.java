import controllers.CreateBookingController;
import controllers.RoomController;
import controllers.UserController;
import data.IDB;
import data.PostgresDataBase;
import repositories.RoomRepository;
import repositories.UserRepository;
import repositories.UsersRepository;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        IDB db = new PostgresDataBase();
        UsersRepository repo = new UserRepository(db);
        UserController userController = new UserController(repo);
        RoomRepository roomRepo = new RoomRepository(db);
        RoomController roomController = new RoomController(roomRepo);
        CreateBookingController createBookingController = new CreateBookingController(db);
        HostelApplication app = new HostelApplication(userController, roomController, createBookingController);
        //app.createUserMenu();
        app.start();
    }
}
