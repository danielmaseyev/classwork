package intro;//package declaration: matches folder where this file is located

//class header 
public class IntroMain {
	
	public static final String[] DESCRIPTIONS = {" is a teacher at BTHS"," is a student at BTHS"}; 

	public static void main(String[] args) {
		//This is the declaration of an instance of CodingConventions
		//in the same line of code, it is also being instantiated
		//note the use of the word "new" this work is always used when calling constructors
		
		
		int numberOfPeople = 10;
		for(int i = 0;i < numberOfPeople; i++) {
			CodingConventions conventionsInstance = new CodingConventions("Daniel Maseyev", i%2);
			//a note on local variables: they are NOT fields (HAS-A relationships)
			//they are variables that are only used in the scope of a method
			//after the method, they are destroyed
			
			//instance method call (the method belongs to the instance, not the class)
			
			conventionsInstance.doStuff();
		}

	}
	
	
}
