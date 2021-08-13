package dao.concDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mySQLDbConnection {
    public static Connection connection;
    private mySQLDbConnection() {
    }
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/players";
            String username = "root";
            String password = "Akshay@1710290";
            connection = DriverManager.getConnection(url, username, password);
            return connection;
    }
}
