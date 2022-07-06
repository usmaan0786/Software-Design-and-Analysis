import javax.swing.*;
import java.awt.*;

public class GUISimple {

    JFrame myFrame;
    JTextField textField;
    JButton b;

    public void initGUI()
    {
        myFrame = new JFrame();

        Container c = myFrame.getContentPane();
        c.setLayout(new FlowLayout()); 

        textField = new JTextField(20);
        b = new JButton("Submit");

        c.add(textField);
        c.add(b);

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(300,200);
        myFrame.setVisible(true);
    }
}
