package com.ty.objectclass;

import javax.net.ssl.HandshakeCompletedEvent;

public class TestD {
	public static void main(String[] args) {
		
		Student s1 = new Student(10, "lokesh", 75);
		System.out.println(s1);
		System.out.println(s1.hashCode());
	}
}
