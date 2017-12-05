package algorithms;

public class RecursionSample {
	private static int total;
	public static void main(String[] args)
	{
		int n = 3; 
		hanoi(5," a "," b "," c ");
	}
	public static int fib(int terms)
	{
		if(terms == 0)
		{
			return 0;

		}
		else{
			total = total +fib(terms - 1);
		}
		return total;
	}
	public static void hanoi(int n,String start,String help, String end)
	{
		if(n==1)
		{
			System.out.print(start + " to " +end);
		}else {
			hanoi(n-1, start, end, help);
			System.out.print(start + " to " + end);
			hanoi(n-1,help,start, end);
		}
	}
}	