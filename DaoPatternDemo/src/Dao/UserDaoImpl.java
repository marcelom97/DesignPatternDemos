package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    DBConnector connector = null;
    Connection con;
    private List<User> users;

    public UserDaoImpl() throws SQLException {
        this.users = new ArrayList<User>();
        this.connector = DBConnector.getConnection();
    }

    @Override
    public List<User> getAllUsers() throws SQLException {
        connector.establishConnection();
        con = connector.getCon();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from test.users");
        while (rs.next()) {
            int id = rs.getInt("id");
            String firstname = rs.getString("firstname");
            String lastname = rs.getString("lastname");
            String email = rs.getString("email");
            users.add(new User(id, firstname, lastname, email));
        }
        connector.closeConnection();
        return this.users;
    }

    @Override
    public User getSpecificUser(int id) throws SQLException {
        User myUser = null;
        connector.establishConnection();
        con = connector.getCon();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from test.users where id=" + id + "");
        while (rs.next()) {
            int userid = rs.getInt("id");
            String firstname = rs.getString("firstname");
            String lastname = rs.getString("lastname");
            String email = rs.getString("email");
            myUser = new User(userid, firstname, lastname, email);
        }
        connector.closeConnection();
        return myUser;
    }

    @Override
    public void updateSpecificUser(int id, String name) throws SQLException {
        connector.establishConnection();
        con = connector.getCon();
        Statement stmt = con.createStatement();
        int rs = stmt.executeUpdate("update test.users set firstname='" + name + "' where id='" + id + "';");
        connector.closeConnection();
    }

    @Override
    public void addUser(int id, String firstname, String lastname, String email) throws SQLException {
        connector.establishConnection();
        con = connector.getCon();
        Statement stmt = con.createStatement();
        int rs = stmt.executeUpdate("insert into test.users value (" + id + ",'" + firstname + "','" + lastname + "','" + email + "');");
        connector.closeConnection();
    }

    @Override
    public void deleteUser(int id) throws SQLException {
        connector.establishConnection();
        con = connector.getCon();
        Statement stmt = con.createStatement();
        int rs = stmt.executeUpdate("delete from test.users where id='" + id + "';");
        users.remove(id - 1);
        connector.closeConnection();
    }
}
