package com.ty.lambdaexpressions;

public class TestSquare {
	public static void main(String[] args) {
		
		SquareInterface s = (a)-> a*a;
		
		int x = s.square(5);
		
		System.out.println(x);
	}
}
