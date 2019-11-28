package com.ty.exception.first;

public class PVR {


	void book(){
		
		System.out.println("PVR Started");
		
		try {
		System.out.println(10/0);	
		System.out.println("PVR logic");
		System.out.println("booking confirmed");
		
		}catch(ArithmeticException ae) {
			
			System.out.println("Booking failed");
			throw ae;
		}
		
	}
}
