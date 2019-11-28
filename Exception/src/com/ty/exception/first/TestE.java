package com.ty.exception.first;

public class TestE {
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		String s = "hello";        // if s = null; then it gives null pointer exception because we modify null in 15 line.
		
		int[] a = {10,20,30};
		int b = 10;
		
		try {
			
			String s1 = s.toUpperCase();
			System.out.println(s1);
			System.out.println(a[2]);
			System.out.println(b/0);
			
		}catch(NullPointerException npi) {
			
			System.out.println("Don't play with null");
			
		}catch(ArrayIndexOutOfBoundsException ai) {
			
			System.out.println("Array index is not present");
			
		}catch(ArithmeticException ae){
			
			System.out.println("Number divided by zero");
			
		}catch(Exception e) {                      //always write Exception catch block at last only.
			
			e.printStackTrace();
		}
		
		System.out.println("Main ended");
	}
}
