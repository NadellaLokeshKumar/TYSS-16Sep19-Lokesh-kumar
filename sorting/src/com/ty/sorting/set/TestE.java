package com.ty.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;				// output will be in sorting order. 

public class TestE {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet<>();
		
		ts.add(34);			// we should add only generics(same type of data).
		ts.add(45);
		ts.add(12);
		ts.add(9);
		ts.add(39);
//		ts.add("deepika");			// class cast exception.
//		ts.add(null);				// null pointer exception.
		
		System.out.println("******Using for each************");
		for(Object s : ts) {
			System.out.println(s);
		}
		System.out.println("*********Using iterator***********");
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
