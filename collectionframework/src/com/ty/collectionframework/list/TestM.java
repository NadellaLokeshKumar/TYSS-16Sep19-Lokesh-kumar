package com.ty.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestM {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("lokesh");
		al.add("naveen");
		al.add("karthik");
		al.add("sagar");
		al.add("vishnu");
		
		System.out.println("Before sort "+al);
		Collections.sort(al);
		System.out.println("After sort "+al);
		}
}
