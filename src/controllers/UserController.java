package controllers;

import entity.User;
import repositories.UsersRepository;

public class UserController {
    private final UsersRepository repo;
    public UserController(UsersRepository repo){
        this.repo = repo;
    }
    public String createUser(String name, String surname, double balance){
        User user = new User(name, surname, balance);
        boolean created = repo.createUser(user);
        return (created ? "User was created" : "User creation failed");
    }
}
