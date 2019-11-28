package naveen;

public class demo5 {
public static void main(String[] args) {
	int x=12;
	int y=0;
	try {
		System.out.println("try block started");
		y=x/0;
		System.out.println("try block ended");}
		catch(ArithmeticException e1) {
			System.out.println("unable to divide by 0");
			y=x/5;
			System.out.println("e1.getMessage()");
			e1.printStackTrace();
		}
		System.out.println("x value:"+x);
		System.out.println("y value:"+y);
}
}

