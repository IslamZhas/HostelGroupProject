package entity;

public class Room {
    private int id;
    private int roomNumber;
    private String name;
    private int numberOfBeds;
    public Room(int roomNumber, int numberOfBeds, String type) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.name = name;
    }
    public Room(int id, int roomNumber, int numberOfBeds, String type) {
        this(roomNumber, numberOfBeds, type);
        this.id = id;
    }
    public int getRoomNumber() {
            return roomNumber;
        }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;    }

    public String getType() {
        return name;    }

    public void setType(String type) {
        this.name = type;    }
    public int getNumberOfBeds() {
        return numberOfBeds;    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;    }

    @Override
    public String toString() {
        return "Room{" +
                "id = " + id +
                ", name = " + name +
                ", room number " + roomNumber +
                ", number of beds " + numberOfBeds +
                "}";
    }
}


