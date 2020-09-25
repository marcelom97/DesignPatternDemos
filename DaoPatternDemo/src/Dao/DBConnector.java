package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    private static DBConnector instance = null;
    private Connection con;

    private DBConnector() {
    }

    public static DBConnector getConnection() {
        if (DBConnector.instance != null) {
            System.out.println("This is a single connection!");
            return null;
        }
        System.out.println("Creating new connection");
        return DBConnector.instance = new DBConnector();
    }

    public Connection getCon() {
        return con;
    }

    public void establishConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                "root",
                "marcelo1");
            System.out.println("Connection Established");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            this.con.close();
            System.out.println("Connection Closed");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
