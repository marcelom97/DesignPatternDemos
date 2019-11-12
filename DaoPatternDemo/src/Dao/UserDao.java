package Dao;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {

    public List<User> getAllUsers() throws SQLException;

    public User getSpecificUser(int id) throws SQLException;

    public void updateSpecificUser(int id, String name) throws SQLException;

    public void addUser(int id, String firstname, String lastname, String email) throws SQLException;

    public void deleteUser(int id) throws SQLException;
}
