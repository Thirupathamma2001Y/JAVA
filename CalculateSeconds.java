class CalculateSeconds
{
	public static void main(String[] args) 
	{
	int seconds = 100000;
	int perDaySeconds =86400;
	int days =seconds/perDaySeconds;
	 seconds =seconds%perDaySeconds;
	double hrs = seconds/3600;
	 seconds =seconds%3600;
	 int min =seconds/60;
	 seconds = seconds%60;

		System.out.println(days);
		//System.out.println(seconds);
		//System.out.println(seconds);
		System.out.println(hrs);
		System.out.println(seconds);
		System.out.println(min);


	}
}
