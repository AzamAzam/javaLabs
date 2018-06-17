import pucit.dao.StudentDAO;
import pucit.entity.Student;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;


public class MyActionListner implements ActionListener {
    JButton btns[];
    JTextField textFields[];
    Student student;
    ArrayList<Student> studentList;

    boolean isdatafetch;
    int record;


    public MyActionListner(JButton[] btn, JTextField fields[]) {
        btns = btn;
        textFields = fields;
        student = new Student();

        isdatafetch = false;
        record = 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // String input = e.getActionCommand();
        if (e.getSource() == btns[0])  // insert
        {
            student.setValues(textFields[0].getText(), textFields[1].getText(), textFields[2].getText(), textFields[3].getText());
            try {
                (new StudentDAO()).insertByPreparedStatment(student);
                textFields[0].setText(null);
                textFields[1].setText(null);
                textFields[2].setText(null);
                textFields[3].setText(null);
                isdatafetch = false;

            } catch (SQLException e1) {

                e1.printStackTrace();
            }
        } else if (e.getSource() == btns[1]) //search
        {
            student.setPhone(textFields[2].getText());
            try {
                 (new StudentDAO()).searchByPreparedStatement(student);


                textFields[0].setText(student.getName());
                textFields[1].setText(student.getAddress());
                textFields[2].setText(student.getPhone());
                textFields[3].setText(student.getEmail());

                System.out.print(student);

            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } else if (e.getSource() == btns[2]) //delete
        {
            student.setPhone(textFields[2].getText());
            textFields[0].setText(null);
            textFields[1].setText(null);
            textFields[2].setText(null);
            textFields[3].setText(null);
            isdatafetch = false;
            try {
                (new StudentDAO()).deleteByPreparedStatement(student);
            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        } else if (e.getSource() == btns[4])   //update
        {
            student.setValues(textFields[0].getText(), textFields[1].getText(), textFields[2].getText(), textFields[3].getText());

            try {
                (new StudentDAO()).updateByPreparedStatement(student);
                textFields[0].setText(null);
                textFields[1].setText(null);
                textFields[2].setText(null);
                textFields[3].setText(null);
                isdatafetch = false;
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } else if (e.getSource() == btns[3])  //<<
        {
            if (!isdatafetch) {
                try {
                    studentList = (new StudentDAO()).getAllStudent();

                    isdatafetch = true;


                } catch (SQLException e1) {
                    e1.printStackTrace();
                }

            } else if (record > 0)
                record--;
            setTextFieldsFromArrayList();

        } else if (e.getSource() == btns[5])  //>>
        {
            if (!isdatafetch) {
                try {
                    studentList = (new StudentDAO()).getAllStudent();

                    isdatafetch = true;


                } catch (SQLException e1) {
                    e1.printStackTrace();
                }

            } else if (record < studentList.size() - 1)
                record++;
            setTextFieldsFromArrayList();


        }
    }

    void setTextFieldsFromArrayList() {
        if (studentList.size() > 0) {
            textFields[0].setText(studentList.get(record).getName());
            textFields[1].setText(studentList.get(record).getAddress());
            textFields[2].setText(studentList.get(record).getPhone());
            textFields[3].setText(studentList.get(record).getEmail());

        }
    }
}
