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
    public String getRoom(int id){
        Room room = roomsRepository.getRoom(id);

        return (room == null ? "Room with that id was not found" : room.toString());
    }

}
