package Dao;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {

    List<User> getAllUsers() throws SQLException;

    User getSpecificUser(int id) throws SQLException;

    void updateSpecificUser(int id, String name) throws SQLException;

    void addUser(int id, String firstname, String lastname, String email) throws SQLException;

    void deleteUser(int id) throws SQLException;
}
