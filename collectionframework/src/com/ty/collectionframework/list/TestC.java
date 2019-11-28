package com.ty.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(23);
		al.add(true);
		al.add(60.5);
		al.add("Good Evening");
		
		
		Iterator it = al.iterator();
		
		Object o1 = it.next();
		System.out.println(o1);
		
		Object o2 = it.next();
		System.out.println(o2);
		
		Object o3 = it.next();
		System.out.println(o3);
		
		Object o4 = it.next();
		System.out.println(o4);
		
		boolean b = it.hasNext();
		System.out.println("has next: "+b);
		
		/*Object o5 = it.next();
		System.out.println(o5);				//NoSuchElementException.
		*/
		
		
		System.out.println("****************");
		
		for(int i = 0;i<al.size();i++) {
			
			Object o = al.get(i);
			System.out.println(o);
		}
		
		ArrayList al1 = new ArrayList();
		al1.add(12);
		al1.add(23.3);
		al1.add("mono");
		al1.add(true);
		
		System.out.println("=======================Using Iterator====================");
		
		Iterator it1 = al1.iterator();
		
		while(it1.hasNext()) {
			
			Object o = it1.next();
			System.out.println(o);
		}
		
		
	}
}
