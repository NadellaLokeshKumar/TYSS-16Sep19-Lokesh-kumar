package naveen;

public class demo4 {
public static void main(String[] args) {
	int x=5;
	int y=0;
	int[] a1=new int[5];
	try {
		System.out.println("outer try block is started");
		try {
			System.out.println("inner try block is started");
			y=x/10;
			System.out.println("inner try block is ended");
			}
	catch(ArithmeticException e1) {
		System.out.println("unable to divide by 0");
		x=y/10;
	}
		a1[5]=y;
		System.out.println("outer try block is ended");
	}
	catch(ArrayIndexOutOfBoundsException e2) {
		System.out.println("unable to divide by 0");
		a1[5]=y;
		System.out.println(e2.getMessage());
		e2.printStackTrace();
}
	finally{
		System.out.println("run always");}
	System.out.println("x value:"+x);
	System.out.println("y value:"+y);
}
}
