
public class Invoice implements Payable{

	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	public Invoice( String part, String description, int count, double price )
			{
				partNumber = part;
				partDescription = description;
				setQuantity( count ); 
				setPricePerItem( price ); 
			} 
	//***************************************************************
	
	 	public String getPartNumber()
	 	{
		 return partNumber;
	 	} 
	 
	 	public String getPartDescription()
	 	{
		 return partDescription;
	 	}
	//***************************************************************
	 	public void setQuantity( int count )
	 		{
	 			if ( count >= 0 )
	 				{
	 				quantity = count;
	 				}
	 			else
	 			{
	 				throw new IllegalArgumentException( "Quantity must be >= 0" );
	 			}
	 		}
	 	
	 	public int getQuantity()
	 		{
	 			return quantity;
	 		} 
	//***************************************************************
	 	public void setPricePerItem( double price )
	 		{
	 			if ( price >= 0.0 )
	 				{
	 					pricePerItem = price;
	 				}
	 			else
	 			{
	 					throw new IllegalArgumentException("Price per item must be >= 0" );
	 			}
	 		} 
	 	
	 	public double getPricePerItem()
	 		{
	 			return pricePerItem;
	 		}
	 //***************************************************************
	 	@Override
	 	public double getPaymentAmount()
	 	{
	 		return getQuantity() * getPricePerItem();
	 	}
	 //***************************************************************
}
