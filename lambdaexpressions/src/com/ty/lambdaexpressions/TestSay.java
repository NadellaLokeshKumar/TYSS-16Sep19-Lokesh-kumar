package com.ty.lambdaexpressions;

public class TestSay {
	public static void main(String[] args) {
		
		SayInterface s = () -> System.out.println("sayhi"); 
		
		s.sayhi();
	}
}
