package com.ty.sorting.set;

import java.util.HashSet;			//it doesn't have index. it doesn't preserve insertion order.
import java.util.Iterator;

public class TestA {
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet<>();
		hs.add(12);
		hs.add(45);
		hs.add("deepa");
		hs.add(56.7);
		hs.add(12);			//duplicates are not allowed.
		hs.add(null);		// we can add only one null.
		
		System.out.println("*******Using for each************");
		for(Object o : hs) {
			System.out.println(o);
		}
		
		System.out.println("*************Using iterator**********");
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object s = it.next();
			System.out.println(s);
		}
	}
}
