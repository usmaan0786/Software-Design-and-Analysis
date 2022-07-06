public class CreditCard extends Payment {
    private String name;
    private int cardNo;
    private String expiryDate;
    private String transactionPassword;
    
    public CreditCard()
    {
        name  = "Usman Manzoor";
        cardNo = 123;
        expiryDate = "30-12-2021";
        transactionPassword = "usman123";
    }

    public void processPayment()
    {
        if(name  == "Usman Manzoor" && cardNo == 123 && expiryDate == "30-12-2021" &&  transactionPassword == "usman123")
        {
            System.out.println("CreditCard Payment Successfull");
        }
        else{
            System.out.println("Invlaid Inputs");
        }
    }
}
