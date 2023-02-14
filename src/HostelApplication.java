import controllers.RoomController;
import controllers.UserController;
import entity.User;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HostelApplication {
    private final UserController userController;
    private final RoomController roomController;
    private final Scanner scanner;
    public HostelApplication(UserController userController, RoomController roomController){
        this.userController = userController;
        this.roomController = roomController;
        scanner = new Scanner(System.in);
    }
    public void start() {
        boolean run = true;
        while (run) {
            System.out.println("You have been successfully entered to application");
            System.out.println("Choose one option");
            System.out.println("1) Show all available rooms");
            System.out.println("2) Book the room");
            System.out.println("3) Cancel the booking");
            System.out.println("4) Delete the booking");
            System.out.println("5) Exit");
            try {
                int action = scanner.nextInt();
                switch (action) {
                    case 1:
                        createUserMenu();
                }
            } catch (InputMismatchException e) {
                System.out.println("Input must be integer");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public void createUserMenu() {
        System.out.println("Welcome to Hostel Application");
        System.out.println("Create an account to get access");
        System.out.println("Write down your name:");
        String name = scanner.next();
        System.out.println("Write down your surname");
        String surname = scanner.next();
        System.out.println("What amount of money are you counting on?");
        Double balance = scanner.nextDouble();
        String response = userController.createUser(name, surname, balance);
        System.out.println(response);
    }
}
