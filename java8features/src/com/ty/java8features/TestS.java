package com.ty.java8features;

import java.util.ArrayList;

public class TestS {

	public static void main(String[] args) {
		
		
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(5, "lokesh", 35.5));
		al.add(new Student(3, "naveen", 70.6));
		al.add(new Student(6, "karthik", 38.5));
		al.add(new Student(2, "vishnu", 68.5));
		al.add(new Student(1, "sagar", 26.5));
		
		Helper h = new Helper();
//		h.displayAllStudent(al);
//		h.displayFailedStudents(al);
//		h.displayPassedStudents(al);
		h.topperOfClass(al);
		
		
	}
}
