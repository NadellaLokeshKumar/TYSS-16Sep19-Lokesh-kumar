package com.ty.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class TestE {

	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(70);
		marks.add(65);
		marks.add(35);
		marks.add(26);
		marks.add(42);
		marks.add(55);
		
		Comparator<Integer> cmp = (m1, m2) ->{
			if(m1>m2) {
				return 1;
			}else if(m1<m2) {
				return -1;
			}else {
				return 0;
			}
		};
		
		long noOfFailedStudents = marks.stream().filter(i -> i < 40).count();
		System.out.println(noOfFailedStudents);
		
		System.out.println("==============");
		
		
		Integer i = marks.stream().min(cmp).get();
		System.out.println(i);
		
		System.out.println("============");
		
		
		Integer j = marks.stream().max(cmp).get();
		System.out.println(j);
		
		
		
		
		
		
}
}
