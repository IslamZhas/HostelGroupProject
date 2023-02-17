package entity;

public class Room {
    private int id;
    private int roomNumber;
    private String name;
    private int numberOfBeds;
    private int cost;
    private boolean booked;
    public Room(String name, int roomNumber, int numberOfBeds, int cost, boolean booked) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.name = name;
        this.cost = cost;
        this.booked = booked;
    }
    public Room(int id,String name, int roomNumber, int numberOfBeds, int cost, boolean booked) {
        this(name, roomNumber, numberOfBeds, cost, booked);
        this.id = id;
    }
    public int getRoomNumber() {
            return roomNumber;
        }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;    
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;    
    }

    @Override
    public String toString() {
        return "\n" + "Room: " +
                "id = " + id +
                ", name = " + name +
                ", room number " + roomNumber +
                ", number of beds " + numberOfBeds +
                ", cost " + cost + ", booked = " + booked + "\n";
    }
}


