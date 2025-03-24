package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/abc";
    private static final String Username = "root";
    private static final String Password = "1488";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, Username, Password);
            System.out.println("Connected to the database successfully");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.err.println("Could not connect to the database");
        }
        return conn;
    }

}
