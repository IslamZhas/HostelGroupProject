public class Student extends Person  {
    private int rollNumber;
    private int roomNumber;
    public Student(String adam_adam, String s) {
        super(adam_adam, s);    }
    public int getRollNumber() {
        return rollNumber;    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;    }

    public int getRoomNumber() {
        return roomNumber;    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;    }

}
