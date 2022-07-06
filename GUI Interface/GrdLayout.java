import javax.swing.*;
import java.awt.*;

public class GrdLayout {
    JFrame jFrame;
    JButton jb1, jb2, jb3, jb4, jb5, jb6;

    public void initGUI()
    {
        jFrame = new JFrame();

        Container c = jFrame.getContentPane();

        c.setLayout(new GridLayout(2, 3));

        jb1 = new JButton("Next Slide");
        jb2 = new JButton("Previous Slide");
        jb3 = new JButton("Back to Start");
        jb4 = new JButton("Last Slide");
        jb5 = new JButton("Exit");
        jb6 = new JButton("Usman");

        c.add(jb1);
        c.add(jb2);
        c.add(jb3);
        c.add(jb4);
        c.add(jb5);
        c.add(jb6);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(300, 400);
        jFrame.setVisible(true);
    }
    
}
