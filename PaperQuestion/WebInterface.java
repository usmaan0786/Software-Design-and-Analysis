import java.util.*;

public class WebInterface {
    public static void main(String[] args)
    {
        int opt;
        ProductDatabase x = new ProductDatabase();

        System.out.println("Welcome to the Online Shopping Store!!!");
        System.out.println("**************************************");
        System.out.println("Here is the list of Products....");
        
        x.showProduct();

        System.out.println("Select Payment Method");
        System.out.println("Press 1 for Paypal\nPress 2 for Creditcard");

        Scanner input = new Scanner(System.in);
        opt = input.nextInt();

        if(opt == 1)
        {
            Paypal paypal = new Paypal();
            paypal.processPayment();
        }
        else if(opt == 2)
        {
            CreditCard creditcard = new CreditCard();
            creditcard.processPayment();
        }
        else
        {
            System.out.println("Wrong Input!!!");
        }
    }
}
