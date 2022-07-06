public class salariedEmp extends employee {
    
    private double WeeklySalary;

    public salariedEmp(String fname, String lname, Double Salary)
    {
        super(fname, lname);
        setWeeklySalary(Salary);
    }

    public void setWeeklySalary(Double Salary)
    {
        if(Salary > 0.0)
        {
            WeeklySalary = Salary;
        }
        else
        {
            throw new IllegalArgumentException("Salary Must be Greater than 0.0!!!");
        }
    }

    public double getWeeklySalary()
    {
        return WeeklySalary;
    }

    public double earnings()
    {
        return getWeeklySalary();
    }
}
