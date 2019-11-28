package com.ty.exception.first;

public class TestC {
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		int[] a = {10,20,30};
		int b = 10;
		
		try {
			System.out.println(a[4]);
			System.out.println(b/2);     // it is valid but not executed because of exception in 12 line. so use individual try catch block.
			
		}catch(ArithmeticException ae){
			
			System.out.println("Number divided by zero");
			
		}catch(ArrayIndexOutOfBoundsException ai) {
			
			System.out.println("Arra index is not present");
		}
		
		System.out.println("Main ended");
	}
}
