package com.ty.beanobject.bean;

public class TestA {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(12);
		s.setName("lokesh");
		s.setRollno(234);
		
		Database db = new Database();
		db.receive(s);
	}

}
