package com.ty.objectclass;

public class TestE {
	public static void main(String[] args) {
		
		Car c1 = new Car(5000000, "Fortuner", "Orange");
		System.out.println(c1.hashCode());
		System.out.println(c1);
	}
}
