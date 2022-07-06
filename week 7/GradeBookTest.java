import java.util.Scanner;
public class GradeBookTest {

	public static void main(String[] args) {
		
		//input
		Scanner input = new Scanner( System.in );
		System.out.println( "Please enter the course name:" );
		String theName = input.nextLine();
		//------------------------------------------------------
		//object creation
		GradeBook myGradeBook = new GradeBook();
		
		// call to set method
		myGradeBook.setCourseName(theName);
		
		//Display
		myGradeBook.displayMessage();
	}
  }

