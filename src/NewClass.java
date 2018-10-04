// new class to call from another file's main()
public class NewClass {
  public static void newClassMethod( String[] args) {
	System.out.println( "Hellow world from within NewClass.");
	for( int i=0; i<args.length; i++) {
		System.out.println( "args[ " + i + "]= "+args[ i]);
	}
}
}
