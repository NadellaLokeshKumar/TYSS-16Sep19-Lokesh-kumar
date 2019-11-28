package com.ty.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestG {

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<>();
		Employee e1 = new Employee(1, "veeru");
		Employee e2 = new Employee(4, "yuvi");
		Employee e3 = new Employee(2, "dhoni");
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		Comparator<Employee> cmp = (e4,e5) ->{
			return e4.name.compareTo(e5.name);
		};
		
		List<Employee> l = al.stream().sorted(cmp).collect(Collectors.toList());
		
		Iterator<Employee> it = l.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println("==============");
		}
	}
}
