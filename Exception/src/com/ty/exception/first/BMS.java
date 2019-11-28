package com.ty.exception.first;

public class BMS {
	public static void main(String[] args) {
		
		System.out.println("BMS Started");
		
		PVR p = new PVR();
		try {
			
			p.book();
			System.out.println("Booking confirmed");
			
		}catch(ArithmeticException ae) {
			
			System.out.println("Booking failed");
			
		}
		
		System.out.println("BMS ended");
	}
}
