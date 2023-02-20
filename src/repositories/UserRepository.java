package repositories;

import data.IDB;
import entity.User;

import java.sql.*;

public class UserRepository implements UsersRepository {
    private final IDB db;

    public UserRepository(IDB db) {
        this.db = db;
    }

    public boolean createUser(User user) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "INSERT INTO users(name,surname,balance) VALUES(?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, user.getName());
            st.setString(2, user.getSurname());
            st.setInt(3, user.getBalance());

            st.execute();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }
}

