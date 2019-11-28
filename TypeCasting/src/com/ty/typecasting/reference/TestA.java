package com.ty.typecasting.reference;

public class TestA {
	public static void main(String[] args) {
		Pen  p = new Marker ();        //upcasting
		System.out.println(p.cost);
		p.write();
		
	//	System.out.println(p.size);   //error
	//	p.color();                    //error
		
		
		Marker m = (Marker) p;               //downcasting
		System.out.println(m.size);
		m.color();
		m.write();
		System.out.println(m.cost);
	}
}
