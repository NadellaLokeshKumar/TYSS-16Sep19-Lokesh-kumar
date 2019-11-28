package com.ty.collectionframework.list;

import java.util.ArrayList;

public class TestE {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("Shreya");
		
		Object o = al.get(0);
		String name = (String) o;		//here, we do down casting to apply String properties to the object.
										//to overcome this we use GENERICS(program inTestF)
		
		name = name.toUpperCase();
		System.out.println(name);
	}
}
