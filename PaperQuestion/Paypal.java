public class Paypal extends Payment {
    private String email;
    private String password;

    public Paypal()
    {
        email = "usman@gmail.com";
        password = "usman123";
    }
    public void processPayment()
    {
        if(email == "usman@gmail.com" && password == "usman123")
        {
            System.out.println("Paypal Payment Successfull");
        }
        else{
            System.out.println("Invlaid Email and Password");
        }
    }
}
