package com.ty.singleton;

public class Test {
	public static void main(String[] args) {

		MySingleton ms = MySingleton.getDBConnection();
		ms.s ="hello";
		System.out.println(ms.hashCode());
		

		MySingleton mx = MySingleton.getDBConnection();
		mx.s = "hi";
		mx.t ="bye";
		System.out.println(mx.hashCode());
		
		System.out.println(ms.s);
		
		System.out.println(mx.s);

		System.out.println(mx.t);


	}
}
