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
	private Hobby hobby;
	private Person[] friends;
	private String nickname;
	public Person(String first, String last, Borough home)
	{
		this.firstName = first;
		this.lastName = last;
		this.home = home;
		friends = new Person[3];
		hobby = Hobby.randomHobby();
		nickname = createNickname(firstName);
	}
	
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/*
	 * Pass by value
	 * the parameters of a method contain only values, bnot references
	 * therefore, when they are changed, the REFERENCE to the original
	 * object does not change
	 */
	public static String createNickname(String name)
	{
		String nickname = "";
		int vowel = 0;
		for(int i = 0; i<name.length();i++)
		{
			String letter = name.substring(i, i+1);
			if(isVowel(letter))
			{
				vowel++;
				if(vowel != 2)
				{
					nickname +=letter;
				}else
				{
					return nickname;
				}

			}else {
					nickname += letter;
				}
			}
			return nickname;
		
	}
	public static boolean isVowel(String letter)
	{
		letter = letter.toLowerCase();
		if(letter.equals("a")||letter.equals("e")||letter.equals("u")||letter.equals("i")||letter.equals("o"))
		{
			return true;
		}
		return false;
	}
	public void statYourFriends()
	{
		String statement = "My friends are ";
		for(int i = 0;i< friends.length-1; i++)
		{
			statement += friends[i].firstName + " " + friends[i].lastName+",";

		}
		statement += "and " + friends[friends.length-1];
		System.out.println(statement);
	}
	public void mingle(Person[] peers)
	{
		for(Person p :peers)
		{
			//cant friend urself

			if(p != this)
			{
				setInFirstPlace(p);
			}
		}
	}
	public void setInFirstPlace(Person f)
	{
		for(int i = friends.length-1; i > 0; i--)
		{
			friends[i] = friends[i-1];
		}
		friends[0]=f;
	}
	public String toString()
	{
		return "My name is "+firstName+" "+lastName+". Call me "+ nickname +" and I am from "+home+".";
	}

}