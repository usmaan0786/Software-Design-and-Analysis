
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		int num1,num2,sum;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first Number");
		
		num1= input.nextInt();
		System.out.println("Enter your Second Number");
		num2= input.nextInt();
		sum= num1+num2;
		System.out.println("The sum of two numbers = " + "\t" + sum);
	}

}
