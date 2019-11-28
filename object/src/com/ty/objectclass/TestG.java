package com.ty.objectclass;

public class TestG {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "lokesh", 10000);
		Employee e2 = new Employee(2, "naveen", 20000);
		Employee e3 = new Employee(1, "lokesh", 10000);
		
		Employee e4 = e2;
		
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e2.equals(e4));
	}
}
