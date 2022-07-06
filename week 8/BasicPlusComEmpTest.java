
public class BasicPlusComEmpTest {

	public static void main(String[] args) {
		
		BasicPlusComEmp employee = new BasicPlusComEmp ("Bob", "Lewis", 5000, .04, 300 );
		
		System.out.println ("Employee information : " );
		System.out.println( "First name is"+ employee.getFirstName());
		System.out.println( "Last name is"+ employee.getLastName());
		System.out.println( "Gross sales is" + employee.getGrossSales());
		System.out.println( "Commission rate is" + employee.getCommissionRate());
		System.out.println( "Earning is" + employee.earnings());
	}

} 
