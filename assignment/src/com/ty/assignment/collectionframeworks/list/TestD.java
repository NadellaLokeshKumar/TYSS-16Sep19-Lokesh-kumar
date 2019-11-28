package com.ty.assignment.collectionframeworks.list;

import java.util.Iterator;
import java.util.Vector;
import java.util.ListIterator;

public class TestD {

	public static void main(String[] args) {
		
		
		Vector<Employee> al = new Vector<Employee>();
		Employee e1 = new Employee(1, "lokesh", 20000);
		Employee e2 = new Employee(2, "naveen", 25000);
		Employee e3 = new Employee(3, "karthik", 60000);
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		System.out.println("==========using for loop============");
		
		for(int i = 0;i<al.size();i++) {
			
			Employee e = al.get(i);
			
			System.out.println("ID is "+e.id);
			System.out.println("name is "+e.name);
			System.out.println("salary is "+e.salary);
			System.out.println("------------");
		}
		
		System.out.println("============using for each=============");
		
		for(Employee ea : al) {
			
			System.out.println(ea);
		}
		
		System.out.println("=========using lterator===========");
		
		Iterator<Employee> it  = al.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
		System.out.println("========using list iterator===========");
		System.out.println("======forward ==============");
		
		ListIterator<Employee> li = al.listIterator();
		while(li.hasNext()) {
			Object o = li.next();
			System.out.println(o);
		}
		
		System.out.println("==========backward=========");
		
		while(li.hasPrevious()) {
			Object o = li.previous();
			System.out.println(o);
		}
			
		
	}
	}

