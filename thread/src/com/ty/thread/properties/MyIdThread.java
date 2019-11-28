package com.ty.thread.properties;

public class MyIdThread extends Thread{

	public static void main(String[] args) {
		
		System.out.println("main started");
		
		System.out.println(Thread.currentThread().getId());
		
		MyThread mi = new MyThread();
		System.out.println("my id thread "+mi.getId());
		
	//	mi.setId();  // we can't change the id of thread.
		
	//  Thread.currentThread().setPriority(16);   //IllegalArgumentException.	
		
		System.out.println("main ended");
	}
}
