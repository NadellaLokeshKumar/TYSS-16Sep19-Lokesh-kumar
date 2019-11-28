package com.ty.singleton;

public class MySingleton {
	
	private static MySingleton instance = null;
	String s;
	String t;
	
	private MySingleton() {
		 
	}
	
	public static MySingleton getDBConnection() {
		
		if(instance == null) {
			
			instance = new MySingleton();
			return instance;
		}else {
			
			return instance;
		}
	}
}
