package DAO;

import Entity.Contact;

import java.sql.*;

public class ContactDAO {
    public static Connection con = null;

    public ContactDAO() {

        try {
            Class.forName("org.postgresql.Driver");

            String dbType = "jdbc:postgresql:";
            String dbUrl = "//localhost:";
            String dbPort = "5432/";
            String dbName = "labs";
            String dbUser = "postgres";
            String dbPass = "postgres";

            con = DriverManager.getConnection(dbType + dbUrl + dbPort + dbName, dbUser, dbPass);
            System.out.println("Opened database successfully");
            // create();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());

        }
    }

    public void InsertData(Contact contact) {
        
        String q = "INSERT INTO contact (fname, lname, mobile, email, uname, password) VALUES (?,?,?,?,?,?);";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(q);
            preparedStatement.setString(1, contact.getFname());
            preparedStatement.setString(2, contact.getLname());
            preparedStatement.setString(3, contact.getMobile());
            preparedStatement.setString(4, contact.getEmail());
            preparedStatement.setString(5, contact.getUname());
            preparedStatement.setString(6, contact.getPassword());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Contact readDate(String uname) {
        String q = "SELECT *FROM contact WHERE uname=?";
        Contact contact = new Contact();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(q);
            preparedStatement.setString(1, uname);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                contact.setFname(rs.getString(1));
                contact.setLname(rs.getString(2));
                contact.setMobile(rs.getString(3));
                contact.setEmail(rs.getString(4));
                contact.setUname(rs.getString(5));
                contact.setPassword(rs.getString(6));

            }
            else {
                contact.setUname(" ");
                contact.setPassword(" ");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contact;
    }
}
