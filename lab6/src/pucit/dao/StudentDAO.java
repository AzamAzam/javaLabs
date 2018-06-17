package pucit.dao;

import pucit.entity.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class StudentDAO extends GenericDAO {

    ArrayList<Student> studentList;

    public StudentDAO() {
        studentList = new ArrayList<Student>();
    }


    public void insertByPreparedStatment(final Student student) throws SQLException {
        String sql = "INSERT INTO STUDENT (name, address, phone, email)  VALUES (?, ?, ?, ?);";
        PreparedStatement preStmt = conn.prepareStatement(sql);
        preStmt.setString(1, student.getName());
        preStmt.setString(2, student.getAddress());
        preStmt.setString(3, student.getPhone());
        preStmt.setString(4, student.getEmail());
        System.out.println(preStmt.execute());

        conn.close();

    }
/*
    public Student searchByPreparedStatement(Student student) throws SQLException {
        String sql = "SELECT *FROM STUDENT WHERE PHONE=?";
        PreparedStatement preStmt = conn.prepareStatement(sql);
        preStmt.setString(1, student.getPhone());
        ResultSet resultSet = preStmt.executeQuery();
        conn.close();

       if (resultSet.next())
           student.setValues(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4));
       else {
           student.setValues("","","","");
       }
       return student;
    }
*/
public void  searchByPreparedStatement( Student student) throws SQLException {
    String sql = "SELECT *FROM STUDENT WHERE PHONE=?";
    PreparedStatement preStmt = conn.prepareStatement(sql);
    preStmt.setString(1, student.getPhone());
    ResultSet resultSet = preStmt.executeQuery();
    conn.close();

    if (resultSet.next())
        student.setValues(resultSet.getString("name"), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4));
    else {
        student.setValues("","","","");
    }
   // return student;
}
    public void  deleteByPreparedStatement(Student student) throws SQLException {
        String sql = "DELETE FROM student  where phone=?;";
        PreparedStatement preStmt = conn.prepareStatement(sql);
        preStmt.setString(1, student.getPhone());
        preStmt.executeUpdate();

        conn.close();
    }

    public   void  updateByPreparedStatement(Student student) throws SQLException{
        String sql ="UPDATE student SET  name=?,email=?,address=? WHERE phone=?;";
        PreparedStatement preStmt = conn.prepareStatement(sql);
        preStmt.setString(1, student.getName());
        preStmt.setString(2, student.getEmail());
        preStmt.setString(3, student.getAddress());
        preStmt.setString(4, student.getPhone());    // primary  key

        preStmt.executeUpdate();
        conn.close();
    }


	public ArrayList<Student> getAllStudent() throws SQLException {
        String sql = "SELECT *FROM STUDENT ";
        PreparedStatement preStmt = conn.prepareStatement(sql);
        ResultSet resultSet = preStmt.executeQuery();
        conn.close();
        while (resultSet.next()) {
            Student student = new Student();
            student.setValues(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4));
            studentList.add(student);
        }
        return studentList;
    }

}
