package com.ty.assignment.collectionframeworks.list;

import java.util.Stack;
import java.util.Iterator;
import java.util.ListIterator;

public class TestH {

	
public static void main(String[] args) {
		
		Stack<Teacher> al1 = new Stack<Teacher>();
		
		Teacher t1 = new Teacher(1, "sagar", 70000);
		Teacher t2 = new Teacher(2, "vishnu", 35000);
		Teacher t3 = new Teacher(3, "supreeth", 40000);
		
		al1.add(t1);
		al1.add(t2);
		al1.add(t3);
		
		System.out.println("=========using for loop=========");
		
		for(int i = 0;i<al1.size();i++) {
			
			Teacher t = al1.get(i);
			System.out.println("ID is "+t.id);
			System.out.println("name is "+t.name);
			System.out.println("salary is "+t.salary);
			System.out.println("------------------");
		}
		
		System.out.println("========using for each===========");
		
		for(Teacher t : al1) {
			System.out.println(t);
		}
		
		System.out.println("==========using Iterator======");
		
		Iterator<Teacher> it = al1.iterator();
		
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
		System.out.println("=====using list iterator===========");
		
		System.out.println("=========forward============");
		
		ListIterator<Teacher> lt = al1.listIterator();
		
		while(lt.hasNext()) {
			Object o = lt.next();
			System.out.println(o);
		}
		
		System.out.println("==========previous============");
		
		while(lt.hasPrevious()) {
			Object o = lt.previous();
			System.out.println(o);
		}
		
	}
}
