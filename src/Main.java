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
        HostelApplication app = new HostelApplication(userController, roomController);
        //1app.createUserMenu();
        app.start();
    }
}
