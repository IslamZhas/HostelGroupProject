import controllers.CreateBookingController;
import controllers.RoomController;
import controllers.UserController;
import entity.Room;
import entity.User;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class HostelApplication {
    private final UserController userController;
    private final RoomController roomController;
    private final CreateBookingController createBookingController;
    private final Scanner scanner;
    public HostelApplication(UserController userController, RoomController roomController, CreateBookingController createBookingController){
        this.userController = userController;
        this.roomController = roomController;
        this.createBookingController = createBookingController;
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to Hostel Application");
        System.out.println("Create an account to get access");
        System.out.println("Write down your name:");
        String name = scanner.next();
        System.out.println("Write down your surname");
        String surname = scanner.next();
        System.out.println("What amount of money are you counting on?");
        Integer balance = scanner.nextInt();
        User user = new User(name,surname, balance);
        String response0 = userController.createUser(name, surname, balance);
        System.out.println(response0);
        boolean run = true;
        while (run) {
            System.out.println("You have been successfully entered to application");
            System.out.println("Choose one option");
            System.out.println("1) Show all rooms");
            System.out.println("2) Show all available rooms");
            System.out.println("3) Register the booking");
            System.out.println("4) Exit");
            try {
                int action = scanner.nextInt();
                switch (action) {
                    case 1:
                        String response = roomController.getAllRooms();
                        System.out.println("Rooms menu are provided: ");
                        System.out.println(response);
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("Input must be integer");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
