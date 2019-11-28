package com.ty.beanobject.bean2;

public class Database {
	void save(Employee e) {
		System.out.println("ID is "+e.getId());
		System.out.println("Name is "+e.getName());
		System.out.println("Depeatment is "+e.getDept());
		System.out.println("Designation is "+e.getDesignation());
		System.out.println("Salary is "+e.getSalary());
		System.out.println("************************");
	}
	
}
