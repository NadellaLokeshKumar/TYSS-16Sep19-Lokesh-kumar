package com.ty.typecasting.primitive;

public class TestA {
public static void main(String[] args) {
	
	byte a = 10;
	int b = a;                      //implicit casting
	System.out.println("b is "+b);
	int p = 20;
	double q = p;
	System.out.println("q s "+q);
	System.out.println("*************************");
	
	double x = 20.64;
	int y = (int) x;
	System.out.println("y is "+y);
	byte z = (byte) x;
	System.out.println("z is "+z);
	char r = (char) x;
	System.out.println("r is "+r);
	char s = (char) z;
	System.out.println("s is "+s);
}
}
