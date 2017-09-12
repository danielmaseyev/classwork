package intro;

public class CodingConventions {
	
	//FIELDS ARE AT THE TOP!!!
	private String name;  // NOTE: Declare fields only, instantiate in the constructor
	private String description; 
	
	
	//this is a constructor, it is like a method except the "return type" is 
	// an instance of the class for this reason, a constructor must ALWAYS be named after the class.
	public CodingConventions(String name, int descriptionIndex){
		//there are two variables call "name" the local variable and the field
		//distinguish between the two using the reserved word "this" (field)
		this.name = name;
		//this is a static call to a constant
		description = IntroMain.DESCRIPTIONS[descriptionIndex];
	}
	//normal method "void" is the return type
	public void doStuff(){
		String output = name + description; // use spaces in between operations
		System.out.println(output);
	}
}
