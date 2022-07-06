
public class PayableInterfaceTest {

	public static void main(String[] args) {
		
		Payable obj = new Invoice("01234", "seat", 2, 375.00);
		System.out.println(obj.getPaymentAmount());

	}
	//******************************************************************************************
}
