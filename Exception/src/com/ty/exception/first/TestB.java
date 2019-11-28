package com.ty.exception.first;

public class TestB {
	public static void main(String[] args) {
		System.out.println("Main method started");
		
		int a = 10;
		int b = 0;
		
		try {
			b = 10/0;
			System.out.println(b);         //after the exception, remaining code in try block can't execute
			System.out.println("Hello");
			System.out.println("Happy Diwali");
			
		}catch(ArithmeticException ae){
			System.out.println("number is divided by zero");
		}
		
		System.out.println("Main ended");
	}
}
