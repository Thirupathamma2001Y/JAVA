class  ReverseNumber
{
	public static void main(String[] args) 
	{
		int num =345;
		int sum =0;
		while(num>0)
		{
		sum =(sum*10)+num%10;
		num =num/10;
		System.out.println("print rev num ="+sum);
	}
}
}
