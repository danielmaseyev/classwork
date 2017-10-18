package array;

import java.util.Arrays;

public class ArraysMains {

	private String[] suits;
	private String[] values;
	public ArraysMains() {
		wednesdayMethods();
		
	
	}	
	private void wednesdayMethods() 
	{
		int[] diceRolls= new int[1000];
		populate(diceRolls);
		int[] data = longestConsecutiveSeqAndIndex(diceRolls);
		int longest = data[0];
		System.out.println("the longest sequence is "+ longest + "rolls." + "it happened on roll #"+data[1] + "the sequence was: "
				+Arrays.toString(subArray(diceRolls,data[1], data[0]))+".");
	}	
	private int  longestConsecutiveSeqAndIndex(int[] arr)
	{
		int[] data = new int[2];
		data[0]=1;
		int currentCount = 1;
		for(int i = 0; i < arr.length; i++)
		{
			while(i + currentCount< arr.length && isConsec(arr,i,i+currentCount))
					{
					currentCount++;
					}
			
				if(currentCount > data[0])
				{
					data[0] = currentCount;
					data[1] = i;
				}
				i=i+currentCount-1;
				currentCount=1;
			
		}
		return data;
	}
	private void tuesdayMethods() {
		int[] orderTest = {1,2,3,4,5,6,7,8,9,10};
		cycleThrough(orderTest, 5);
		System.out.println(Arrays.toString(orderTest));
	}
	private int longestConsecutiveSequence(int[] arr)
	{
		int maxLength = 1;
		int currentCount = 1;
		for(int i = 0; i < arr.length; i++)
		{
			while(i + currentCount< arr.length && isConsec(arr,i,i+currentCount))
					{
					currentCount++;
					}
			
				if(currentCount > maxLength)
				{
					maxLength = currentCount;
				}
				i=i+currentCount-1;
				currentCount=1;
			
		}
		return maxLength;
	}
	private boolean isConsec(int[] arr, int start, int end)
	{
		for(int i = start; i < end; i++)
		{
			if(arr[i]!=arr[i+1]+1)
			{
				return false;
			}
		}	
		return true;
	}
	private void cycleThrough(int[] orderTest, int x) {
		for(int i = 0; i < x; i++)
		{
			frontToBack(orderTest);
		}
		
	}
	private void frontToBack(int[] arr) {
		int first = arr[0];
		for(int i = 0; i < arr.length-1; i++)
		{
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = first;
	}
	private void warmUpMethods()
	{
		int[] orderTest = {1,2,3,4,5,6,7,8,9,10};
		reverseOrder(orderTest);
		System.out.println(Arrays.toString(orderTest));
		System.out.println(Arrays.toString(subArray(orderTest,3,4)));
	}
	public void cardMethods()
	{
		suits = new String[4];
		suits[0]= "Clubs";
		suits[1]= "Hearts";
		suits[2]= "Diamonds";
		suits[3]= "Spades";
		values = new String[13];
		for(int i = 0; i < values.length; i++) {
			values[i]=""+(i+1);
		}
		values[0]="Ace";
		values[12]="King";
		values[11]="Queen";
		values[10]="Jack";
		//printDeck();
		//System.out.println(Arrays.toString(intRay));
	}

	private void shuffle(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			swap(arr,i,(int)(Math.random()*arr.length));
		}
	}

	private void swap(int[] arr, int i, int j) {
		int placeholder = arr[i];
		arr[i] = arr[j];
		arr[j] = placeholder;
	}

	private void populate1ToN(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i]= i + 1;
		}
	}

	private void checkOccurences(int[] arr, int start, int end) {
		int[] counter = new int[end-start+1];
		for(int value: arr) {
			counter[value-start]++;
		}
		for(int i = 0; i < counter.length; i++) {
			System.out.println("A "+(start+i)+" was "
					+ "rolled "+counter[i]+" times.");
		}
	}

	private void populate(int[] intRay) {
		for(int i =0; i < intRay.length; i++) {
			intRay[i] = diceRoll(3);
		}
//		//This does not work:
//		for(int value: intRay) {
//			value = diceRoll(2);
//		}
		
		
	}

	//public void notes() {
		//1. collection of primitives or objects
		//SPECIAL NOTE: This is the ONLY collection of primitives
		
		//2. size cannot be modified
		
		/*
		 * 3. Elements of an array are REFERENCES to objects. 
		 * In other words, changing an element of an array changes 
		 * the REFERENCE, not the object (more on this later)
		 */
		
		//_________________________________________
		
		//There two types of constructors, the first we've seen already:
	//	int[] firstType = {3,14,-9,10};
		//this constructor can only be used at the declaration. Error:
		//firstType = {12,13,14,15};
		
		//the 2nd type:
		
		/*SPECIAL NOTE: for primitive arrays, when they are instantiated,
		they are automatically populated with 0s. This is not the case with 
		Object arrays, which are populated with 'null'
		*/
		
		//standard 'for' loop
		/*for(int i = 0; i < testArray.length; i++) {
			System.out.println("The #"+i+" item is:"+testArray[i]);
		}
		
		//for each loop (useful only when you don't need to keep track of an index
		for(String value:testArray) {
			//"for each int in testArray..."
			System.out.println(value);
		}
	}
	
	public static void main(String[] args) {
		ArraysMain arrayPractice = new ArraysMain();
	}
	
	/**
	 * Returns the result from rolling "numberOfDice" dice.
	 * @param numberOfDice
	 * @return
	 */
		
	public int diceRoll(int numberOfDice) {
		int roll = 0;
		for(int i = 0; i < numberOfDice; i++) {
			roll = roll + 1+(int)(Math.random()*6);
		}
		return roll;
	}
	public void reverseOrder(int[]arr)
	{
		for(int i = 0; i < arr.length/2; i++)
		{
			
			swap(arr,i,arr.length-1-i);
		}
	}
	private int[] subArray(int[] arr, int psn, int length)
	{
		int[] sub= new int[length];
		for(int i = 0; i <length; i++)
		{
			sub[i] = arr[i+psn];
		}
		return sub;
	}

}
