package com.ty.java8features;

import java.util.function.Supplier;

public class TestE {

	public static void main(String[] args) {
		
		Supplier<Student> s = () -> new Student(2, "lokesh", 55.5);
		
		Student s1 = s.get();
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.percentage);
		
		
		Supplier<Integer> i = () -> 20;
		int val = i.get();
		System.out.println(val);
		
		Supplier<String> sp = () -> "Good Evening";
		String v = sp.get();
		System.out.println(v);
	}
}
