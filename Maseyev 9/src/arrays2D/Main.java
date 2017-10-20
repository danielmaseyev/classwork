package arrays2D;

public class Main {

	public static void main(String[] args)
	{
		Array2DSampler test = new Array2DSampler();
	}

	private static void changeNeighbors(int[] arr, int i)
	{
		if(i<arr.length)
		{
			arr[i] = arr[1]+1;
		}
		
	}

}
