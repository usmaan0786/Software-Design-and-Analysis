
// Represents an automated teller machine

public class ATM {

		private boolean userAuthenticated; // whether user is authenticated
		private int currentAccountNumber; // current user's account number
		private Screen screen; // ATM's screen
		private Keypad keypad; // ATM's keypad
		private CashDispenser cashDispenser; // ATM's cash dispenser
		private DepositSlot depositSlot; // ATM's deposit slot
		private BankDatabase bankDatabase; // account information database
	
		private static final int BALANCE_INQUIRY = 1;
		private static final int WITHDRAWAL = 2;
		private static final int DEPOSIT = 3;
		private static final int EXIT = 4;
		
	//*************************************************************
		public ATM()
		{
			userAuthenticated = false;
			currentAccountNumber = 0;
			screen = new Screen(); 
			keypad = new Keypad(); 
			cashDispenser = new CashDispenser(); 
			depositSlot = new DepositSlot(); 
			bankDatabase = new BankDatabase();
		}
	//*************************************************************
		public void run()
		{
		// welcome and authenticate user; perform transactions
			while ( true )
				{
						while ( !userAuthenticated )
							{
									screen.displayMessageLine( "\nWelcome!" );
									authenticateUser(); // Function Call to Authenticate User
							}
		
					performTransactions(); // Function Call to perform Transactions
					userAuthenticated = false;
					currentAccountNumber = 0;
					screen.displayMessageLine( "\nThank you! Goodbye!" );
				} 
		 } 
	//*************************************************************
		private void authenticateUser()
		{
			screen.displayMessage( "\nPlease enter your account number: " );
			int accountNumber = keypad.getInput(); 
			screen.displayMessage( "\nEnter your PIN: " );
			int pin = keypad.getInput();
			userAuthenticated = bankDatabase.authenticateUser( accountNumber, pin );
			
			if ( userAuthenticated )
				{
					currentAccountNumber = accountNumber; // save user's account #
				} 
				else
				{
					screen.displayMessageLine("Invalid account number or PIN. Please try again." );
				} 
		}
		
	//*************************************************************
		private void performTransactions()
		{
			Transaction currentTransaction = null;
			boolean userExited = false;
			
			while ( !userExited )
				{
				 // show main menu and get user selection
					int mainMenuSelection = displayMainMenu(); // Function Call
					
					switch ( mainMenuSelection )
					{
						// user chose to perform one of three transaction types
						case BALANCE_INQUIRY:
						case WITHDRAWAL:
						case DEPOSIT:
						// initialize as new object of chosen type
						currentTransaction = createTransaction( mainMenuSelection );
						currentTransaction.execute(); 
						break;
						case EXIT:
						screen.displayMessageLine( "\nExiting the system..." );
						userExited = true; 
						break;
						default:
						screen.displayMessageLine("\nYou did not enter a valid selection. Try again." );
						break;
					} 
				} 
			} 
		
	//*************************************************************
		private int displayMainMenu()
			{
				screen.displayMessageLine( "\nMain menu:" );
				screen.displayMessageLine( "1 - View my balance" );
				screen.displayMessageLine( "2 - Withdraw cash" );
				screen.displayMessageLine( "3 - Deposit funds" );
				screen.displayMessageLine( "4 - Exit\n" );
				screen.displayMessage( "Enter a choice: " );
				return keypad.getInput();
			} 
	//*************************************************************
		private Transaction createTransaction( int type )
			{
				Transaction temp = null;
				switch ( type )
					{
						case BALANCE_INQUIRY: // create new BalanceInquiry transaction
						temp = new BalanceInquiry(currentAccountNumber, screen, bankDatabase );
						break;
						case WITHDRAWAL: // create new Withdrawal transaction
						temp = new Withdrawl( currentAccountNumber, screen, bankDatabase, keypad, cashDispenser );
						break;
						case DEPOSIT: // create new Deposit transaction
						temp = new Deposit( currentAccountNumber, screen,
						bankDatabase, keypad, depositSlot );
						break;
					} 
				
				return temp; // return the newly created object
			} 
	//*************************************************************
	
}
