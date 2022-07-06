
public class GradeBook {

	private String courseName;
	private int[] grades;

	public GradeBook( String name, int [] gradesArray)
		 {
			courseName = name;
			grades= gradesArray;
		 }
		
			public String getCourseName()
			{
			return courseName;
			} 
				
			public void displayMessage()
			{
			System.out.println( "Welcome to the grade book for " + getCourseName() );
			} 
	// __________________________________________________________________________________

			public void processGrades()
			{
				// Function1
				outputGrades();
				System.out.println( "**********************************************************" );
				System.out.println( "Class average is" + "\n" + getAverage() );
				System.out.println( "**********************************************************" );
				System.out.println( "Lowest grade is " + getMin());
				System.out.println( "Highest grade is " + getMax());
				System.out.println( "**********************************************************" );
			}

	//_____________________________________________________________________________________
			public void outputGrades()
			{
				System.out.println( "The grades are:\n" );
				for ( int student = 0; student < grades.length; student++ )
				{
					System.out.println( "Student " + (student + 1) + ":" + "\t" + grades[ student ] );
				}
			}
			//****************************
			public double getAverage()
			{
				int total = 0;
				//for each loop
				for ( int grade : grades )
				{
					total += grade;
				}
				return (double) total /grades.length ;
			}
			//****************************
			public int getMin()
			{
				int lowGrade = grades[0];
				for ( int grade : grades )
					{
					if ( grade < lowGrade )
					{lowGrade = grade; }
					}
				return lowGrade;
			}
			//****************************
			public int getMax()
			{
				int highGrade = grades[0];
				for ( int grade : grades )
					{
					if ( grade > highGrade )
					{highGrade = grade; }
					}
				return highGrade;
			}
			//****************************
	//_______________________________________________________________________________________
}

