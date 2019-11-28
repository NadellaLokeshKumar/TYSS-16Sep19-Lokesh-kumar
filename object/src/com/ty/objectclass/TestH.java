package com.ty.objectclass;

public class TestH {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1 = new Person(10, "lokesh");
		
		
		System.out.println("p1 id "+p1.id);
		System.out.println("p1 name "+p1.name);
		
		
		Object o = p1.clone();
		Person p2 = (Person)o;  // p2 is copy of original object
		System.out.println("p2 id "+p2.id);
		System.out.println("p2 name "+p2.name);
		
		p2.id = 200;
		p2.name = "surya";
		
		System.out.println("**************After cloning***************");
		System.out.println("p1 id "+p1.id);
		System.out.println("p1 name "+p1.name);   //if we change p2, original object won't change.
		
		System.out.println("p2 id "+p2.id);
		System.out.println("p2 name "+p2.name);
		
	}
}
