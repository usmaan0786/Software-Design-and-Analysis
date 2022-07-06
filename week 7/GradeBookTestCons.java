
public class GradeBookTestCons {
	
	public static void main(String[] args) {
	
		GradeBookCons gradeBook1 = new GradeBookCons( "Software Construction & Development" );
		GradeBookCons gradeBook2 = new GradeBookCons("Software Design & Architecture" );
		
		System.out.println( "gradeBook1 course name is" + "\t" +  gradeBook1.getCourseName() );
		System.out.println( "gradeBook2 course name is" + "\t" +  gradeBook2.getCourseName() );

    }
}
