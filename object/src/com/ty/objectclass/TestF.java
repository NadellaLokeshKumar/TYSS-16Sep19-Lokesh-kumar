package com.ty.objectclass;

public class TestF {
	public static void main(String[] args) {
		Cow c1 = new Cow(1, "ganga", 10000);
		Cow c2 = new Cow(2, "gowri", 20000);
		Cow c3 = new Cow(1, "ganga", 10000);
		Cow c4 = c3;
		
		
//		System.out.println(c1.equals(c2)); //it checks hashcode.
	boolean isEqual = c1.equals(c2);
	System.out.println(c1.equals(c3));
	System.out.println(c3.equals(c4));
	System.out.println(isEqual);
		
	}
}
