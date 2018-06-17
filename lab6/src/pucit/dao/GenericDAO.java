package pucit.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class GenericDAO {
    public static Connection conn;

    public GenericDAO() {
        this.config();
    }

    public void config() {

        try {

            //Class.forName("org.postgresql.Driver");
            // Database info
            String dbType = "jdbc:postgresql:";
            String dbUrl = "//localhost:";
            String dbPort = "5432/";
            String dbName = "test";
            String dbUser = "postgres";
            String dbPass = "postgres";
            conn = DriverManager.getConnection(dbType + dbUrl + dbPort + dbName, dbUser, dbPass);
            System.out.println("Opened database successfully");
            // create();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

    }

}
