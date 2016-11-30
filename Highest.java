class Highest
{
	public static void main (String[] args)
	{
		System.out.print ("Enter First Number : ");
		int a = Integer.parseInt(System.console().readLine());
		System.out.print("Enter the Second Number : ");
		int b = Integer.parseInt(System.console().readLine());
		System.out.print("Enter the Third Number : ");
		int c = Integer.parseInt(System.console().readLine());
		if ( (a > b ) && (a > c))
		System.out.println ("Max is : " +a);
		else if ((a > b) && (a < c))
		System.out.println ("Max is : " +c);
		else
		System.out.println ("Max is : " +b);
	}
}