import javax.swing.JOptionPane;

public class AdditionOnDialogueBox{
    public static void main(String[] args)
    {
        String fnum = JOptionPane.showInputDialog("Enter first number : ");
        String lnum = JOptionPane.showInputDialog("Enter Second number : ");
        int num1 = Integer.parseInt(fnum);
        int num2 = Integer.parseInt(lnum);

        int sum = num1 + num2;
        JOptionPane.showMessageDialog(null, "The Sum of two numbers is " + sum + " " +  JOptionPane.INFORMATION_MESSAGE);
        
    }    
}