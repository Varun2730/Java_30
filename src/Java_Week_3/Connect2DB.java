package Java_Week_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect2DB {

    private static final String URL = "jdbc:postgresql://localhost:5432/java";
    private static final String USER = "varun2730";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
