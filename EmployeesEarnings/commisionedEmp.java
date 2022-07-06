import java.util.function.DoubleBinaryOperator;

public class commisionedEmp extends employee {
    
    private double gross_Sales;
    private double commission_Rate;

    public commisionedEmp(String fname, String lname, double sales, double rate)
    {
        super(fname, lname);
        setGrossSales(sales);
        setCommissionRate(rate);
    }

    public void setGrossSales(double sales)
    {
        if (sales >= 0.0)
        {
            gross_Sales = sales;
        }
        else
        {
            throw new IllegalArgumentException("Gross Sales must be greater than 0.0");
        }
    }

    public void setCommissionRate(double rate)
    {
        if(rate >= 0.0 && rate < 3.0)
        {
            commission_Rate = rate;
        }
        else
        {
            throw new IllegalArgumentException("Commission Rate must be greater than 0.0 and Less than 3.0");
        }
    }

    public double getCommissionRate()
    {
        return commission_Rate;
    }

    public double getGrossSales()
    {
        return gross_Sales;
    }

    public double earnings()
    {
        return getCommissionRate() * getGrossSales();
    }
}
