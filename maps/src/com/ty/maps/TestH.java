package com.ty.maps;

import java.util.Hashtable;

public class TestH {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<>();
		
		ht.put(101, "ajay");
		ht.put(102, "vijay");
		ht.put(184, "sonu");
		ht.put(103, "monu");
		ht.put(101, "sriram");
//		ht.put(null, "john");		//NullPointerException.
//		ht.put(108, null);		    //NullPointerException.
		
		System.out.println("Data "+ht);
	}
}
