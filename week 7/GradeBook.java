
// Classes, Objects, and Functions
// Working with Multiple Classes

public class GradeBook {

	private String courseName; 
	
	// method to set the course name
		public void setCourseName( String name )
		{
		courseName = name; 
		} 
	
	// method to retrieve the course name
		public String getCourseName()
		{
		return courseName;
		} 
	
	// display a welcome message to the GradeBook user
		public void displayMessage()
		{
		System.out.println( "Welcome to the grade book for" + getCourseName());
		}

  }
