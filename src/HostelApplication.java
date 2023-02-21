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
                        case 2:
                        String response2 = roomController.getAvailableRooms();
                        System.out.println("All available rooms are provided: ");
                        System.out.println(response2);
                        break;
                    case 3:
                        String response3 = roomController.getAvailableRooms();
                        System.out.println(response3);
                        System.out.println("Please enter id of the room by choosing one from list: ");
                        int registerById = scanner.nextInt();
                        Room registerBooking = roomController.getRoom(registerById);
                        if(createBookingController.createBooking(registerBooking, user)){
                            System.out.println("Succesfully registered to: " + registerBooking.toString());
                        }
                        else System.out.println("Balance is too low " + registerBooking.getName());
                    case 4:
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
