package YouCanMixApp;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection // DatabaseConnection singleton class
{
    private static Connection conn = null;

    //    Connection getConnection() throws SQLException, ClassNotFoundException
    static {
        // Construct the connection URL
//        String dbURL = "jdbc:mysql://localhost:3306/YouCanMixAdmin";
        String dbURL = "jdbc:mysql://localhost:3306/mysql";
        String userId = "YouCanMixAdmin";
        String password = "YouCanMix2";


//        Class.forName("java.sql.Driver");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // get a connection
            conn = DriverManager.getConnection(dbURL, userId, password);
            getConnection().setAutoCommit(true);
        } catch (Exception balls) {
            System.out.println(balls.getMessage());
        }
//        Class.forName("com.microsoft.sqlserver.jdbc");


        // Set the auto-commit off
//        getConnection().setAutoCommit(true);

//        return conn;
    }

    public static Connection getConnection() {
        return conn;
    }
}