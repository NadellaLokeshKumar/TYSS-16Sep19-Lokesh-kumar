package com.ty.lambdaexpressions;

public class TestMseeage {
	
	public static void main(String[] args) {
		
		ReadMessage r = (message)-> {
			System.out.println("Hello");
			System.out.println(message);
			
			}; 
		r.greet("lokesh");

	}
}
