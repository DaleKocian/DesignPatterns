package creational.objectpool.example1;

import java.sql.Connection;

/**
 * Created by dkocian on 12/13/13.
 */
public class Main {
    private static final String DRIVER = "org.hsqldb.jdbcDriver";
    private static final String DSN = "jdbc:hsqldb://localhost/mydb";
    private static final String USER = "sa";
    private static final String PASSWORD = "secret";

    public static void main(String args[]) {
        // Do something...
        // Create the ConnectionPool:
        JDBCConnectionPool pool = new JDBCConnectionPool(DRIVER, DSN, USER, PASSWORD);
        // Get a connection:
        Connection con = pool.checkOut();
        // Use the connection
        // Return the connection:
        pool.checkIn(con);
    }
}
