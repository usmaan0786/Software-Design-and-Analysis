
import javax.swing.*; 

public class Swing {

	public static void main(String args[]){
		
	String input1 = JOptionPane.showInputDialog("Enter first Number");
	double number1 = Double.parseDouble(input1);
	String input2 = JOptionPane.showInputDialog("Enter Second Number");
	double number2 = Double.parseDouble(input2);
	double sum = number1 + number2; 
	
	JOptionPane.showMessageDialog(null, "The sum of two numbers = "+ sum);
	}
	
 }
