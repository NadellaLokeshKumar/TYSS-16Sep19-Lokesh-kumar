
public class Recursion {
	static int fact = 1;
	static int factorial(int x) {
		
		if(x>=1) {
		fact = fact * x;
		factorial(x-1);
		}
		return fact;
	}
	public static void main(String[] args) {
		
		System.out.println(Recursion.factorial(4));
	}

	
}
