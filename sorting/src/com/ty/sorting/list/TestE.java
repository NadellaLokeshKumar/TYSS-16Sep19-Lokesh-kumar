package com.ty.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestE {
public static void main(String[] args) {
	
	ArrayList<Marker> al = new ArrayList<>();
	al.add(new Marker(50, "blue"));
	al.add(new Marker(70, "red"));
	al.add(new Marker(80, "green"));
	al.add(new Marker(40, "black"));
	
	System.out.println("Before sorting----------");
	display(al);
	
	SortByPrice sb = new SortByPrice();
	SortByColor sc = new SortByColor();
//	Collections.sort(al, sb);
	Collections.sort(al, sc);
	
	System.out.println("After sorting--------------");
	display(al);
	
}
static void display(ArrayList<Marker> a) {
	
	Iterator<Marker> it = a.iterator();
	while(it.hasNext()) {
		Marker m = it.next();
		System.out.println("price is "+m.price);
		System.out.println("color is "+m.color);
		System.out.println("=========================");
	}
}
}
