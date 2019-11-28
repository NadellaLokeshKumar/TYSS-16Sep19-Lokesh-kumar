package com.ty.beanobject.bean2;



public class TestA {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(12);
		e.setName("lokesh");
		e.setDept("EEE");
		e.setDesignation("Java Developer");
		e.setSalary(20000.0);
		
		Database db = new Database();
		db.save(e);
	}
}
