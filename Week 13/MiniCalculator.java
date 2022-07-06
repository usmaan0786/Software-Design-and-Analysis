import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MiniCalculator implements ActionListener{

	JFrame frame; 
	JLabel firstOperand, secondOperand, answer; 
	JTextField op1, op2, ans; 
	JButton plus, mul; 
	
	public void initGUI ( ) { 
		frame = new JFrame(); 
		firstOperand = new JLabel("First Operand"); 
		secondOperand = new JLabel("Second Operand"); 
		answer = new JLabel("Answer"); 
		op1 = new JTextField (15); 
		op2 = new JTextField (15); 
		ans = new JTextField (15); 
		plus = new JButton("+"); 
		plus.setPreferredSize(new Dimension(70,25)); 
		mul = new JButton("*"); 
		mul.setPreferredSize(new Dimension(70,25)); 
		//______________________________________________
		Container cont = frame.getContentPane(); 
		cont.setLayout(new FlowLayout());	
		//______________________________________________
		 cont.add(firstOperand); 
		 cont.add(op1); 
		 cont.add(secondOperand); 
		 cont.add(op2); 
		 cont.add(plus); 
		 cont.add(mul); 
		 cont.add(answer); 
		 cont.add(ans); 
		 //________________________________________________
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		 frame.setSize(200, 220); 
		 frame.setVisible(true); 
		 //_______________________________________________
		 //Step 3 Event Registration
		 plus.addActionListener(this);
		 mul.addActionListener(this);
	}
	//___________________________________________________________________
	//Step 2 Event Listener
		public void actionPerformed(ActionEvent event) {
			String oper, result;
			int num1, num2, res;
			
			if (event.getSource() == plus) 
				{
				oper = op1.getText();
				num1 = Integer.parseInt(oper);
				oper = op2.getText();
				num2 = Integer.parseInt (oper);
				res = num1+num2;
				result = res+"";
				ans.setText(result);
				}
			else if (event.getSource() == mul) 
				{
				oper = op1.getText();
				num1 = Integer.parseInt(oper);
				oper = op2.getText();
				num2 = Integer.parseInt (oper);
				res = num1*num2;
				result = res+"";
				ans.setText(result);
				}
	 }
	
	//***************************************
}