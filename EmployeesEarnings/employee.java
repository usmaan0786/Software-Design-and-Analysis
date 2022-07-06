public abstract class  employee {
    
    private String firstname;
    private String lastname;

    public employee(String fname, String lname )
    {
        firstname = fname;
        lastname = lname;
    }

    public void setFirstName(String fname)
    {
        firstname = fname;
    }

    public String getFirstName()
    {
        return firstname;
    }

    public void setLastName(String lname)
    {
        lastname = lname;
    }

    public String getLastName()
    {
        return lastname;
    }

    public abstract double earnings();

}
