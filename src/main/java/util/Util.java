package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/test";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";

    private Util() {
    }

    public static Connection getJDBCConnection() {
        Connection connection;
        try {
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            System.out.println("Соединение не установлено...");
            throw new RuntimeException(e);
        }
        return connection;
    }


}
