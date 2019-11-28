package com.ty.exception.first;

public class Paytm {
	void book() {
		
		System.out.println("Paytm Statred");
		
		IRCTC i = new IRCTC();
		i.confirm();
		
		System.out.println("Paytm ended");
	}
}
