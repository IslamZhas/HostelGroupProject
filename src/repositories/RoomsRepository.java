package repositories;

import entity.Room;

import java.util.List;

public interface RoomsRepository 
{
    List<Room> getAllRooms();
    Room getRoom(int id);

    List<Room> getAllAvailableRooms();
}
