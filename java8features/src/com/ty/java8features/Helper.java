package com.ty.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


public class Helper {

	void displayAllStudent(ArrayList<Student> al) {
		
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Nsme is "+s.name);
			System.out.println("percentage is "+s.percentage);
			System.out.println("==================");
		}
	}
	
	void displayFailedStudents(ArrayList<Student> al){
		
		List<Student> l = al.stream().filter(student -> student.percentage < 40).collect(Collectors.toList());
		
		Iterator<Student> it = l.iterator();
		while(it.hasNext()) {
			Student e = it.next();
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println("==============");
		}
	}
	
void displayPassedStudents(ArrayList<Student> al){
		
		List<Student> l = al.stream().filter(student -> student.percentage > 40).collect(Collectors.toList());
		
		Iterator<Student> it = l.iterator();
		while(it.hasNext()) {
			Student e = it.next();
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println("==============");
		}
	}

	


void topperOfClass(ArrayList<Student> al) {
	
	Comparator<Student> cmp = (m1,m2) ->{
		if(m1.percentage>m2.percentage) {
			return 1;
		}else if(m1.percentage<m2.percentage) {
			return -1;
		}else {
			return 0;
		}
	};
	
	System.out.println("******Topper is***********");
	
	Student s = al.stream().max(cmp).get();
	System.out.println(s.name);
	System.out.println(s.id);
	System.out.println(s.percentage);
}
}
