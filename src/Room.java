public class Room {
    private int id;
    private int roomNumber;
    private String type;
    private int numberOfBeds;

    public Room(int id, int roomNumber, int numberOfBeds, String type) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.type = type;
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
}