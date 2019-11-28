package com.ty.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {

	public static void main(String[] args) {
		
		SortBycustmorName sp = new SortBycustmorName();
		TreeSet<Custmor> ts = new TreeSet<>(sp);
		ts.add(new Custmor(1, "lokesh", 25000));
		ts.add(new Custmor(2, "anil", 10000));
		ts.add(new Custmor(3, "naveen", 30000));
		ts.add(new Custmor(4, "farooq", 45000));
		 System.out.println("**********using Iterator*******");
		 
		 Iterator<Custmor> it = ts.iterator();
		 while(it.hasNext()) {
			 Custmor c = it.next();
			 System.out.println("Id is "+c.id);
			 System.out.println("name is "+c.name);
			 System.out.println("salary is "+c.salary);
		 }
}
}
