
public class InseperablyInaneIterations {
	int a,b,c;
	
	public InseperablyInaneIterations(int a, int b,int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public static void noConstructorNeeded(int a, int b, int c) {
		if(a < 0 || c > 10) {
			System.out.println("a: " + a + ", b: " + b + ", c: " + c);
		}else {
			noConstructorNeeded(b - c, a - c, a + b);
		}
	}
	
	public int constructorNeeded() {
		return a * (b - c);
	}
}
