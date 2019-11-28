package com.ty.exception.first;

public class TestG {
	public static void main(String[] args) {

		System.out.println("main started");


		Paytm p = new Paytm();

		try {

			p.book();

		}catch(ArithmeticException ae) {

			System.out.println("Exception caught in main method");
			
		}finally {
			
			System.out.println("Executing finally");
		}

		System.out.println("main ended");
	}
}
