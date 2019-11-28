package com.ty.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "lokesh", 25000);
		Employee e2 = new Employee(2, "naveen", 35000);
		Employee e3 = new Employee(3, "kumar", 15000);
		Employee e4 = new Employee(4, "subbarao", 45000);
		Employee e5 = new Employee(5, "ratna kumari", 28000);
		Employee e6 = new Employee(6, "sagar", 50000);
		Employee e7 = new Employee(7, "karthik", 75000);
		Employee e8 = new Employee(8, "vishnu", 33000);
		Employee e9 = new Employee(9, "supreeth", 60000);
		
		
		ArrayList<Employee> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		ArrayList<Employee> al1 = new ArrayList<>();
		al1.add(e4);
		al1.add(e5);
		al1.add(e6);
		
		ArrayList<Employee> al2 = new ArrayList<>();
		al2.add(e7);
		al2.add(e8);
		al2.add(e9);
		
		HashMap<Integer,ArrayList<Employee>> hm = new HashMap<>();
		
		hm.put(1, al);
		hm.put(2, al1);
		hm.put(3, al2);
		
		ArrayList<Employee> manager2 = hm.get(2);
		
		Iterator<Employee> it = manager2.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("Id is "+e.id);
			System.out.println("Name is "+e.name);
			System.out.println("Salary is "+e.salary);
			System.out.println("==================");
		}
		
				
		
	}
}
