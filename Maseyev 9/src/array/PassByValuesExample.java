package array;

import java.util.Arrays;

public class PassByValuesExample {
	public static void main(String[] args) {
		String s ="hello";
		Person p = new Person("random", "dude",Borough.NY_BOROUGHS[0]);
		int x = 5;
		int[]arr = {1,2,3};
		test3(arr);
		changeEverything(s,x,arr);
		System.out.println("s is now " +p+", x is "+x+", arr is "+Arrays.toString(arr));
	}

	private static void test1(Person p, int x, int[] arr) 
	{
		String name = p.getFirstName();
		name = "Original";
	}
	private static void test2(Person p)
	{
		p.setFirstName("original");
	
	}
	
	private static void test3(int[] arr)
	{
		arr[0] = 999;
		arr[1] = 998;
	}

	private static void changeEverything(String s, int x, int[] arr) {
		s = "Goodbye";
		x=-5;
		arr = new int[5];
		arr[0] = -1;
		arr[1] = -2;
		
	}

}
