
public class CommisionEmployee {

	protected String firstName;
	protected String lastName;
	protected double grossSales; 
	protected double commissionRate; 
	
		public CommisionEmployee( String first, String last, double sales, double rate )
			{
			firstName = first;
			lastName = last;
			setGrossSales( sales );
			setCommissionRate( rate );
			}
		//*****************************************
			public String getFirstName()
			{
				return firstName;
			} 
			public String getLastName()
			{
				return lastName;
			} 
			//************************************
		public void setGrossSales( double sales )
		{
			if ( sales >= 0.0 )
				{
					grossSales = sales;
				}
			else
				{
					//throw new IllegalArgumentException ("Gross sales must be >= 0.0" );
					System.out.println("Gross sales must be >= 0.0" );
				}
		}
		
		public double getGrossSales()
		{
			return grossSales;
		}
			//***************************************
		 public void setCommissionRate( double rate )
		 {
		 if ( rate > 0.0 && rate < 1.0 )
			 {
				 commissionRate = rate;
			 }
			 else
			 {
				 System.out.println("Commission rate must be > 0.0 and < 1.0" );
			 }
		 } 
		
		 public double getCommissionRate()
		 {
			 return commissionRate;
		 }
		 	//*****************************************
		 public double earnings()
		 {
			 return commissionRate * grossSales;
		 } 
		 	//*****************************************
//		 public String toString()
//		 {
//		 return String.format( "commission employee" + firstName+ lastName +
//		 "gross sales" + grossSales +
//		 "commission rate" + commissionRate );
//		 } 
		 	//******************************************
}
