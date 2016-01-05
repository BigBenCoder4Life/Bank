package db;

/*
 * This is main.
 * @author: Kirtlepb
 * @date: 3/18/14
 */

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

/*
 * Main entry point.
 * 
 */
public class Main {

    public static void main(String[] args) throws SQLException, IOException {
        try {
            System.out.println("Loading the db driver...");
            Class.forName("org.postgresql.Driver");

            System.out.println("Opening database...");
            Connection db = Database.open();

            db.close();
        } catch (SQLException exc) {
            System.err.println("Check your SQL statements");
            System.exit(1);
        } catch (ClassNotFoundException exc) {
            System.err.println("Couldn't find the jar file");
            System.exit(2);
        }
      
        SchoolData.PrintVirginiaDataMAIN();
    }
}
