import pucit.dao.StudentDAO;
import pucit.entity.Student;

import javax.swing.*;
import java.awt.*;


public class GUI  {
    JFrame myFrame;
    JPanel headerPanel, textboxPanel, labelPanel, buttonPanel;
    JTextField textFields[];
    JButton buttons[];
    JLabel output;

    Student student;
    StudentDAO studentDAO;
    MyActionListner myActionListner;

    GUI() {

        textFields=new JTextField[4];
        buttons=new JButton[6];

        student = new Student();
        studentDAO = new StudentDAO();
        myActionListner = new MyActionListner(buttons,textFields);
        myFrame = new JFrame();
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myFrame.setSize(340, 400);
        myFrame.setResizable(false);

        headerPanel = new JPanel();
        textboxPanel = new JPanel();
        labelPanel = new JPanel();
        buttonPanel = new JPanel();

        myFrame.add(headerPanel, BorderLayout.NORTH);
        myFrame.add(textboxPanel, BorderLayout.CENTER);
        myFrame.add(buttonPanel, BorderLayout.SOUTH);
        myFrame.add(labelPanel, BorderLayout.WEST);

        output=new JLabel();
        headerPanel.add(new JLabel("ADDRESS BOOK"));
        labelPanel.setLayout(new GridLayout(5, 1, 1, 3));

        buttons[0] = new JButton("Save");
        buttons[1] = new JButton("Search");
        buttons[2]= new JButton("Delete");
        buttons[3]= new JButton("<<");
        buttons[4]= new JButton("Update");
        buttons[5]= new JButton(">>");


        for  (int  i=0;i<6;i++) {
            buttons[i].addActionListener(myActionListner);
            buttonPanel.add(buttons[i]);
        }


        for  (int  i=0;i<4;i++) {
            textFields[i] = new JTextField();
            textFields[i].setFont(new Font("Times new Roman", Font.PLAIN, 24));
            textboxPanel.add(textFields[i]);
        }

        //     c=myFrame.getContentPane();
        textboxPanel.setLayout(new GridLayout(5, 1, 1, 20));

        labelPanel.add(new JLabel("Name"));
        labelPanel.add(new Label("Address"));
        labelPanel.add(new Label("Phone"));
        labelPanel.add(new Label("Email"));

        output.setText("Search, Delete, Update by your Phone No");
       textboxPanel.add(output);
        buttonPanel.setLayout(new GridLayout(2, 3, 5, 5));

        myFrame.setVisible(true);
    }
}