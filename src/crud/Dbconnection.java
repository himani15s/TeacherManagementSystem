package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {
    static Connection con;

    public static Connection createDBConnection() {
        try {
            // Automatically registered via the SPI
            String url = "jdbc:mysql://localhost:3306/crud";
            String username = "root";
            String password = "#@himan1239SSh";
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }
}
