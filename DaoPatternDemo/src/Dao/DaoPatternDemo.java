package Dao;

import java.sql.SQLException;
import java.util.List;

public class DaoPatternDemo {
    public static void main(String[] args) throws SQLException {
        UserDao userDao = new UserDaoImpl();
        List<User> myUser = userDao.getAllUsers();
        User user;
//        for (User u : myUser) {
//            System.out.println("Id:" + u.getId() + " Firstname:" + u.getFirstName() + " LastName:" + u.getLastName() + " Email:" + u.getEmail());
//        }
//        userDao.deleteUser(1);

//        userDao.addUser(1, "marcelo", "mollaj", "marcelomollaj@gmail.com");
//        userDao.updateSpecificUser(2, "Kostas");
        user = userDao.getSpecificUser(1);
        System.out.println("Specific User Id:" + user.getId() + " Firstname:" + user.getFirstName() + " LastName:" + user.getLastName() + " Email:" + user.getEmail());
    }
}