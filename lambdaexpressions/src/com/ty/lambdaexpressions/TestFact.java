package com.ty.lambdaexpressions;

public class TestFact {

	public static void main(String[] args) {
		
		Factorial f = a -> {
			int fac = 1;
			while(a>0) {
				fac = fac*a;
				a--;
			}
			System.out.println(fac);
		};
		f.fact(5);
		
	}
}
