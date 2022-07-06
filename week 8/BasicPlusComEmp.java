
public class BasicPlusComEmp extends CommisionEmployee {

	private double baseSalary;
	
	public BasicPlusComEmp( String first, String last, double sales, double rate, double salary )
			{
				super( first, last, sales, rate );
				setBaseSalary( salary ); 
			}
		//*******************************************
		public void setBaseSalary( double salary )
		{
		if ( salary >= 0.0 )
			{
			baseSalary = salary;
			}
		else
			{
			throw new IllegalArgumentException("Base salary must be >= 0.0" );
			}
		}
		//*********************************************
		public double getBaseSalary()
		{
			return baseSalary;
		}
		//*********************************************
		@Override
		public double earnings()
		{
			return baseSalary + ( commissionRate * grossSales );
		}
		//**********************************************
}
