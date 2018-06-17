import javax.swing.*;
import java.awt.*;


public class AdressBook extends JFrame {
    JFrame myFrame;
    JPanel p,p1;
    JButton b1, b2, b3, b4;
    JLabel l;

    AdressBook() {
        myFrame = new JFrame();
       myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       myFrame.setSize(180, 200);
        p = new JPanel();
        p1 = new JPanel();

       l = new JLabel("Address Book");

       addComponentsToPane(myFrame.getContentPane());

       myFrame.setVisible(true);
   }
    public  void addComponentsToPane(Container pane) {
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
       l.setAlignmentX(Component.CENTER_ALIGNMENT);
        pane.add(l);
        addAButton("Add contact", pane);
        addAButton("Search Contact", pane);
        addAButton("Delete Contact ", pane);
        addAButton("modify Contact", pane);

    }
    private  void addAButton(String text, Container container) {
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(100,50));

        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(button);
    }

}
