public class hourlyEmp extends employee{
    private double wages;
    private double hours;

    public hourlyEmp( String fname, String lname, double hoursWorked, double hourlyWage)
    {
        super(fname, lname);
        setHours(hoursWorked);
        setWage(hourlyWage);
    }

    public void setWage( double hourlyWage )
	{
		if ( hourlyWage >= 0.0 )
		{
			wages = hourlyWage;
		}
		else
		{
			throw new IllegalArgumentException("Hourly wage must be >= 0.0" );
		}
	}

    public double getWage()
	{
		return wages;
	} 
    public void setHours( double hoursWorked )
	{
		if ( ( hoursWorked >= 0.0 ) && ( hoursWorked <= 168.0 ) )
		{
			hours = hoursWorked;
		}
	    else
		{
		    throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0" );
		}
	}
    public double getHours()
	{
	    return hours;
	}
    
    public double earnings()
    {
    	if ( getHours() <= 40 )
    	{
    		return getWage() * getHours();
    	}
    	else
    	{
    		return 40 * getWage() + ( getHours() - 40 ) * getWage() * 1.5;
    	}
    }
}
