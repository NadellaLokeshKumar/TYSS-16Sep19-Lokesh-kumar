package com.ty.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {

	public static void main(String[] args) {
		
//		SortByName sb = new SortByName();
		SortByPincode sp = new SortByPincode();
//		MICR sm = new MICR();
	 TreeSet<Bank> ts = new TreeSet<>(sp);
	 
	 Bank b1 = new Bank("HDFC", 560068,67686956);
	 Bank b2 = new Bank("SBI", 5601056,45686698);
	 Bank b3 = new Bank("CITI", 560546,23456956);
	 Bank b4 = new Bank("CANARA", 560456,45696789);
	 Bank b5 = new Bank("CANARA", 560456,45696789);
	 
	 ts.add(b1);
	 ts.add(b2);
	 ts.add(b3);
	 ts.add(b4);
	 ts.add(b5);
	 
	 System.out.println("*************using iterator*******");
	 Iterator<Bank> it = ts.iterator();
	 while(it.hasNext()) {
		 Bank b = it.next();
		 System.out.println("Name is "+b.name);
		 System.out.println("pincode is "+b.pincode);
		 System.out.println("MICR is "+b.micr);
		 System.out.println("=================");
		 
	 }
	 
	
	}
}
