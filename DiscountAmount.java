class DiscountAmount 
{
	public static void main(String[] args) 
	{
		int productPrice =1000;
		int quantity =2;
		int totalAmount = productPrice*quantity;
		double discountAmount =(totalAmount/100)*10;
		double netAmount =totalAmount-discountAmount;
		System.out.println("print the TOTALAMOUNT ="+ totalAmount );
		System.out.println("print the DICOUNTAMOUNT ="+ discountAmount );
		System.out.println("print the NETAMOUNT ="+ netAmount );
	}
}
