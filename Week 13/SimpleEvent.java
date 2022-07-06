import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class SimpleEvent implements ActionListener {

	JFrame frame; 
	JButton hello; 
	
	 public void initGUI ( ) { 
		 frame = new JFrame(); 
		 Container cont = frame.getContentPane(); 
		 cont.setLayout(new FlowLayout());
		 //Step 1 Event Generator
		 hello = new JButton("Hello");
		 cont.add(hello); 
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		 frame.setSize(150, 150); 
		 frame.setVisible(true);
		 
		 //Step 3 Event Registration
		 hello.addActionListener(this);
	 }
	 
	 // Step 2 Event Listener
	 	public void actionPerformed(ActionEvent event) {
		 JOptionPane.showMessageDialog(null,"Hello is pressed");
	 }
	 	 
	 
	//**********************************************
}
