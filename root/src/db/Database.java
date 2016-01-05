package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Provides access to the underlying PostgreSQL database.
 *
 * @author mayfiecs
 */
public class Database 
{

    /** JDBC driver name. */
    private static final String DRIVER = "org.postgresql.Driver";

    /** Database connection string. */
    private static final String DB_URL = "jdbc:postgresql://localhost";
    
    /** Database user name. */
    private static final String DB_USER = "bank";

    /** Database password. */
    private static final String DB_PASS = "7pcoxY8rtS";

    /**
     * Static block; loads the JDBC driver.
     */
    static 
    {
        try 
        {
            Class.forName(DRIVER);
        } 
        catch (ClassNotFoundException exc)
        {
            System.err.println("Couldn't find the class.");
            System.exit(3);
        }
    }

    /**
     * Opens a new connection to the database.
     * @return connection - A connection to the database.
     */
    public static Connection open() throws SQLException 
    {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }
}
