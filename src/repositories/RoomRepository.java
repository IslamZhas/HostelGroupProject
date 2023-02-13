package repositories;

import data.IDB;
import entity.Room;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class RoomRepository implements RoomsRepository {
    private final IDB db;
    public RoomRepository(IDB db){
        this.db = db;
    }

}
