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
}
