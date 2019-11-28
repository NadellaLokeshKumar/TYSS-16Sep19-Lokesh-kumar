package com.ty.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestG {

	public static void main(String[] args) {
		
		HashSet<Employee> hs = new HashSet<>();
		
		Employee e1 = new Employee(12, "sweety", 45000);
		Employee e2 = new Employee(34, "teju", 35000);
		Employee e3 = new Employee(5, "giri", 25000);
		Employee e4 = new Employee(25, "sheela", 10000);
		Employee e5 = new Employee(25, "sheela", 10000);		//here it checks hashcodes that's why it allows e5.
																//so we have to override hashcode and equals method then duplicates not allowed.
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		
		System.out.println("********USing iterator********");
		
		Iterator<Employee> it = hs.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("Id is "+e.id);
			System.out.println("Name is "+e.name);
			System.out.println("salary is "+e.salary);
					
		}
		
	}
}
