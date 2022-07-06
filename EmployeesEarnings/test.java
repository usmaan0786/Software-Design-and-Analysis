public class test {
    public static void main(String[] args)
    {
     
        salariedEmp salaried_emp = new salariedEmp("Usman", "Manzoor", 450.00);
        commisionedEmp commisioned_emp = new commisionedEmp("Tayyab", "Naveed",23.00, 2.4);
        hourlyEmp hourly_emp = new hourlyEmp("Ali","Khan", 24.00, 400.00);

        System.out.println("\n****************************\n"); 
        System.out.println("<<<<Employees Working In Organization>>>>");
        System.out.println("\n****************************\n"); 
        System.out.println("Salaried Emp : " + salaried_emp.getFirstName() + " " + salaried_emp.getLastName() 
                            + "\n" + "Weekly Salary " + salaried_emp.getWeeklySalary() + "\n" + "Earnings " + salaried_emp.earnings() );
        System.out.println("\n****************************\n");                    
        System.out.println("Commisioned Emp : " + commisioned_emp.getFirstName() + " " + commisioned_emp.getLastName() 
        + "\n" + "Commission Rate : " + commisioned_emp.getCommissionRate() + "\n" + "Gross Sales : " + commisioned_emp.getGrossSales() + "\n" + "Earnings : " + commisioned_emp.earnings() );
        System.out.println("\n****************************\n");
        System.out.println("Hourly Emp : " + hourly_emp.getFirstName() + " " + hourly_emp.getLastName() 
        + "\n" + "Wages : " + hourly_emp.getWage() + "\n" + "Hours Worekd : " + hourly_emp.getHours() + "\n" + "Earnings : " + hourly_emp.earnings() );
        System.out.println("\n****************************\n"); 
    }
}
