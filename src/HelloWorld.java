//This is a comment, and the line below is initializing the class, classes are smaller parts of a project and can be
//inter-connected and can use each other.
public class HelloWorld {

	//The start of a method, can have multiple in one class
	public static void main (String[] args) {

		//When the project is ran, this line will be executed and appear on the console down below.
		System.out.println("Hello world!  Woo Hoo.  Third.");

		//The code is read from top to bottom, so if you were to add another executable line down below...
		//It will run after the first one.
		System.out.println("Hello computer!");

		AdditionsByEric.myMethod();

		String[] a = {"a", "b"};
		NewClass b = new NewClass();
		NewClass.newClassMethod( a);
		b.newClassMethod( a);

		int j = 1;
		int k = 1;
		int l = 0;
		System.out.println("This is a Fibonacci sequence, the first 10 of them:");
		for( int i=0; i< 10; i++) {
			System.out.println("sequence index: " + i + ": " + j);
			j = j + l;
			l = k;
			k = j;

		}

		j = 1;
		k = 1;
		l = 0;
		System.out.println("This is the same Fibonacci sequence but only the odd numbers:");
		for( int i=0; i< 10; i++) {
			if( j/2.0 != j/2) {
				System.out.println("sequence index: " + i + ": " + j);
			}
			j = j + l;
			l = k;
			k = j;

		}
		
		//quite painful to type....
		InseperablyInaneIterations i = new InseperablyInaneIterations(23,42,25);
		
		System.out.println(i.constructorNeeded());
		
		i.noConstructorNeeded(2, 3, 4); //haha that was kinda a misnomer, wasn't it?
		
		InseperablyInaneIterations.noConstructorNeeded(12, 34, -12); //NOPE! see, no constructor needed! :P
		
	}
}
