package entity;

public class User {
    private int id;
    private String name;
    private String surname;
    private int balance;
    public User(int balance){
        setBalance(balance);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User(String name, String surname, int balance) {
        setName(name);
        setSurname(surname);
        setBalance(balance);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }


    public void setBalance(int balance) {
        this.balance = balance;
    }



    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "User{" +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", balance=" + balance +
                '}';
    }
}
