package com.ty.wrapperclass;

public class TestA {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a is "+a);
		Integer i = a;                  //boxing or auto boxing
		System.out.println("i is "+i);
		
		Integer x = 10;
		Integer z = new Integer(20);
		System.out.println("x is "+x);
		int y = x;                      //unboxing or auto unboxing
		System.out.println("y is "+y);
		System.out.println("z is "+z);
		
		
		int value = Integer.parseInt("134");
		System.out.println("value");
		
		boolean result = Boolean.parseBoolean("true");
		System.out.println(result);
		
		int value1 = Integer.parseInt("546lokesh");
		System.out.println(value1);
		
		boolean result1 = Boolean.parseBoolean("123true");
		System.out.println(result1);
	}
}
