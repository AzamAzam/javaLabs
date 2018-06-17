package DAO;

import Entity.Cities;

import java.sql.*;
import java.util.ArrayList;

public class CitiesDAO {
    public static Connection con = null;

    public CitiesDAO() {
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
    public ArrayList<Cities> readData(String provinceName){
        ArrayList citiesArrayList=new ArrayList<Cities>();
        String Q="SELECT city from cities WHERE province=?";
        try {
            PreparedStatement preparedStatement=con.prepareStatement(Q);
            preparedStatement.setString(1,provinceName);
            ResultSet resultSet=preparedStatement.executeQuery();
            while(resultSet.next()){
                Cities city=new Cities(provinceName,resultSet.getString(1));
                citiesArrayList.add(city);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return citiesArrayList;
    }
}
