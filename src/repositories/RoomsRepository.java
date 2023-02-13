package repositories;

import entity.Room;

import java.util.List;

public interface RoomsRepository {
    Room getRoom(int id);
    List<Room> getAllRooms();
}
