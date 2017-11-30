package algorithms;

public class LionsPuzzle {
	public static void main(String[]args)
	{
		int numberOfLions = 6;
		if(willEat(numberOfLions))
		{
			System.out.println("Eat the sheep!");
		}else {
			System.out.println("Do not eat the sheep!");
		}
	}

	private static boolean willEat(int numberOfLions) {
		System.out.println("Checking result for "+numberOfLions+".");
		if(numberOfLions ==1)
		{
			return true;
		}else {
			boolean b= !willEat(numberOfLions-1);
			System.out.println("Determined "+numberOfLions+" eats sheep is "+ b);
			return b;
		}
	}
}	
