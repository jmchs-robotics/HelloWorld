//This is a comment, and the line below is initializing the class, classes are smaller parts of a project and can be
//inter-connected and can use each other.
public class HelloWorld {
	
	//The start of a method, can have multiple in one class
	public static void main (String[] args) {
		
		//When the project is ran, this line will be executed and appear on the console down below.
		System.out.println("Hello world!");
		
		//The code is read from top to bottom, so if you were to add another executable line down below...
		//It will be ran after the first one.
		System.out.println("Hello computer!");
		
		AdditionsByEric.myMethod();
	}
}
