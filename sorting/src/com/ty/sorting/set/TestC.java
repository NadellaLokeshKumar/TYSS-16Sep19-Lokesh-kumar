package com.ty.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;		//it preserve insertion order.

public class TestC {
	
	public static void main(String[] args) {
		
		LinkedHashSet ls = new LinkedHashSet<>();
		ls.add(34);
		ls.add("nikitha");
		ls.add(89.8);
		ls.add(34);
		ls.add("bhavya");
		ls.add(null);		// we can add only one null.
		ls.add(null);
		
		System.out.println("******Using for each************");
		for(Object s : ls) {
			System.out.println(s);
		}
		System.out.println("*********Using iterator***********");
		Iterator it = ls.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
