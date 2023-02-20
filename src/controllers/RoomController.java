package controllers;

import entity.Room;
import repositories.RoomsRepository;

import java.util.List;

public class RoomController {
    private final RoomsRepository roomsRepository;
    public RoomController(RoomsRepository roomsRepository){
        this.roomsRepository = roomsRepository;
    }
    public String getAllRooms(){
        List<Room> rooms =roomsRepository.getAllRooms();
        return rooms.toString();
    }
    public Room getRoom(int id){
        List<Room> rooms1 = roomsRepository.getAllAvailableRooms();
        Room regRoom = new Room();
        for (Room room1 : rooms1) {
            if (room1.getId()==id){
                regRoom = room1;
                break;
            }
        }
        return regRoom;
    }
    public String getAvailableRooms(){
        List<Room> rooms1 = roomsRepository.getAllAvailableRooms();
        return rooms1.toString();
    }
}

