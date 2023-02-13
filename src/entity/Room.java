package entity;

public class Room {
    private int id;
    private int roomNumber;
    private String type;
    private int numberOfBeds;
    public Room(int roomNumber, int numberOfBeds, String type) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.type = type;
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
        return type;    }

    public void setType(String type) {
        this.type = type;    }
    public int getNumberOfBeds() {
        return numberOfBeds;    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;    }

    @Override
    public String toString() {
        return "Room{" +
                "id = " + id +
                ", type = " + type +
                ", room number " + roomNumber +
                ", number of beds " + numberOfBeds +
                "}";
    }
}


