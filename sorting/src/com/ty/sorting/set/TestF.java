package com.ty.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("divya");		
		ts.add("jaya");
		ts.add("sushma");
		ts.add("muni");
		ts.add("sheela");
		
		System.out.println("******Using for each************");
		for(String s : ts) {
			System.out.println(s);
		}
		System.out.println("*********Using iterator***********");
		Iterator<String> it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
