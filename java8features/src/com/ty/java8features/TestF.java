package com.ty.java8features;

import java.util.function.Consumer;

public class TestF {

	public static void main(String[] args) {
		
		Consumer<Student> c = (s) ->{
			
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.percentage);
		};
		
		Student s1 = new Student(2, "lokesh", 52.25);
		c.accept(s1);
	}
}
