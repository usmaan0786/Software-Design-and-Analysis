import javax.swing.*;
import java.awt.*;

public class BrdrLayout {
    JFrame jFrame;
    JButton b1, b2, b3, b4, b5;

    public void initGUI()
    {
        jFrame = new JFrame();

        Container c = jFrame.getContentPane();

        c.setLayout( new BorderLayout());

        b1 = new JButton("Next Slide");
        b2 = new JButton("Previous Slide");
        b3 = new JButton("Back to Start");
        b4 = new JButton("Last Slide");
        b5 = new JButton("Exit");

        c.add(b1, BorderLayout.NORTH);
        c.add(b2, BorderLayout.EAST);
        c.add(b3, BorderLayout.WEST);
        c.add(b4, BorderLayout.SOUTH);
        c.add(b5, BorderLayout.CENTER);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(300, 400);
        jFrame.setVisible(true);
    }
}
