class DisscountPizza 
{
	public static void main(String[] args) 
	{
		int pizzaNum = 15; 
		int price =150;
		int totalPrice=pizzaNum*price;
		double dicountAmount = (10/100)*totalPrice;
		double  totalAmount=dicountAmount-totalPrice;
		System.out.println(" paid amount is ="+ totalAmount);
	}
}
