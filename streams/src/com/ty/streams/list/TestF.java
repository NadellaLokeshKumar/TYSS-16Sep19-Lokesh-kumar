package com.ty.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestF {

	public static void main(String[] args) {
		
	ArrayList<Integer> al = new ArrayList<>();
	al.add(70);
	al.add(65);
	al.add(35);
	al.add(26);
	al.add(42);
	al.add(55);
	
	
	List<Integer> l = al.stream().sorted().collect(Collectors.toList());
	
	Iterator<Integer> it = l.iterator();
	while(it.hasNext()) {
		Integer i = it.next();
		System.out.println(i);
	}
	
	}

	
}
