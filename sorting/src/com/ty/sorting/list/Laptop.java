package com.ty.sorting.list;

public class Laptop implements Comparable<Laptop>{

	double price;
	int ram;
	String brand;
	
	public Laptop(double price, int ram, String brand) {
		super();
		this.price = price;
		this.ram = ram;
		this.brand = brand;
	}

//	@Override
//	public int compareTo(Laptop s) {
//		
//		Integer i = this.ram;
//		Integer j = s.ram;
//		
//		return i.compareTo(j);
//		
//	}
//	
//	@Override
//	public int compareTo(Laptop s) {
//		
//		String i = this.brand;
//		String j = s.brand;
//		
//		return i.compareToIgnoreCase(j);
//		
//	}
	
	
	@Override
	public int compareTo(Laptop s) {
		
		Double i = this.price;
		Double j = s.price;
		
		return i.compareTo(j);
		
	}
//	
	
	
	
	
}
