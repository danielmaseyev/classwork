package array;

public class Person
{
	public static final String[] FIRST_START = {"Chr", "Am", "L", "Th", "Br", "B"};
	public static final String[] FIRST_MIDDLE = {"ala", "ima", "e", "o", "anna", "r","ola","a"};
	public static final String[] FIRST_END = {"na", "ck", "e", "n","tt", "rian", "lius","lion","les"};
	
	public static final String[] LAST_START = {"Bl", "Am", "L","D", "Th", "Br", "B"};
	public static final String[] LAST_MIDDLE = {"an", "im", "ast", "own", "il"};
	public static final String[] LAST_END = {"strom", "son", "rack", "ev","tt", "ston", "vin","th","rd"};
	private String firstName;
	private String lastName;
	private Borough home;
	public Person(String first, String last, Borough home)
	{
		this.firstName = first;
		this.lastName = last;
		this.home = home;
	}
	public String toString()
	{
		return "My name is "+firstName+" "+lastName+" and I am from "+home+".";
	}
}