package jm.task.core.jdbc.util;

import com.mysql.cj.jdbc.Driver;

import java.nio.file.FileAlreadyExistsException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private final static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final static String URL = "jdbc:mysql://localhost:3306/MyDB_1";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "root1234!";
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (!connection.isClosed()) {
                System.out.println("Good connect");
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Dont load driver SQL");
        }
        return connection;
    }
    // реализуйте настройку соеденения с БД
}
