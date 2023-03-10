package entity;

public class User {
    private int id;
    private String name;
    private String surname;
    private int balance;

    public User(){}
    public User(String name, String surname, int balance) {
        setName(name);
        setSurname(surname);
        setBalance(balance);
    }
    public User(int id, String name, String surname, int balance) {
        this(name, surname, balance);
        setId(id);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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



    public int getBalance() {
        return balance;
    }

    public void paying(int cost){
        this.balance = balance - cost;
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
