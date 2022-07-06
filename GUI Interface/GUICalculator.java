import java.awt.*;
import javax.swing.*;

public class GUICalculator {
    JFrame frame;
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bPLus, bEqual, bMinus, bMul, bDivide, bClear, bPoint;
    JPanel panel;
    JTextField textfield;
    JLabel label;

    public void initGUI()
    {
        frame = new JFrame();

        Container c = frame.getContentPane();

        c.setLayout(new BorderLayout());
        b0 = new JButton("0");
        b1 = new JButton("1"); 
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bPLus = new JButton("+");
        bMinus = new JButton("-");
        bMul = new JButton("*");
        bEqual = new JButton("=");
        bDivide = new JButton("/");
        bClear = new JButton("C");
        bPoint = new JButton(".");

        textfield = new JTextField();
        label = new JLabel("Welcome to the Calculator ");
        panel = new JPanel(new GridLayout(4,4));

        panel.add(b0);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(bPLus);
        panel.add(bMinus);
        panel.add(bMul);
        panel.add(bEqual);
        panel.add(bDivide);
        panel.add(bPoint);
        panel.add(bClear);

        c.add(textfield, BorderLayout.NORTH);
        c.add(panel, BorderLayout.CENTER);
        c.add(label, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
    

}
