
package YouCanMixApp.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.sql.*;

public class JDBCUtil // does any of this code work??
{
    public static Connection getConnection() throws SQLException, ClassNotFoundException
    {
        // Construct the connection URL
//        String dbURL = "jdbc:mysql://localhost:3306/YouCanMixAdmin";
        String dbURL = "jdbc:mysql://localhost:3306/mysql";
        String userId = "YouCanMixAdmin";
        String password = "YouCanMix2";


//        Class.forName("java.sql.Driver");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception balls) {
            System.out.println(balls.getMessage());
        }
//        Class.forName("com.microsoft.sqlserver.jdbc");
        
        // get a connection
        Connection conn = DriverManager.getConnection(dbURL, userId, password);
        	
        // Set the auto-commit off
        conn.setAutoCommit(true);
        	
        return conn;

    }

    public static void closeConnection(Connection conn)
    {
        try {
            if (conn != null)
            {
                conn.close();
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static void closeStatement(Statement stmt)
    {
        try {
            if (stmt != null)
            {
                stmt.close();
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static void closeResultSet(ResultSet rs)
    {
        try {
            if (rs != null)
            {
                rs.close();
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static void commit (Connection conn)
    {
        try {
            if (conn != null)
            {
                conn.commit();
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static void rollback (Connection conn)
    {
        try {
            if (conn != null)
            {
                conn.rollback();
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
