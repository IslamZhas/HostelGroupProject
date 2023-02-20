package controllers;

import data.IDB;
import entity.Room;
import entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CreateBookingController {
    private List<Room> bookings = new ArrayList<>();
    private final IDB db;
    public CreateBookingController(IDB db) {
        this.db = db;
    }
    public boolean  createBooking(Room room, User user) {
        if (room.getCost() <= user.getBalance()) {
            user.paying(room.getCost());
            room.setBooked(true);
            int availableBeds = room.getAvailablebeds() - 1;
            room.setAvailablebeds(availableBeds);


            Connection con = null;
            try {
                con = db.getConnection();
                String sql = "UPDATE rooms SET booked = ?, availablebeds = ? WHERE id = ?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setBoolean(1, true);
                ps.setInt(2, availableBeds);
                ps.setInt(3, room.getId());
                ps.executeUpdate();

                this.bookings.add(room);
                return true;
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    con.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return false;
    }
}
