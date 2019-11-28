package com.ty.assignment.objectarray;

public class Student {
	
	int id;
	String name;
	String dept;
	
	public Student(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}





	public static void main(String[] args) {
		
		Student s1 = new Student(1,"lokesh","EEE");
		Student s2 = new Student(2, "naveen", "EEE");
		Student s3 = new Student(3, "karthik", "ECE");
		Student s4 = new Student(4, "Vishnu", "Mech");
		Student s5 = new Student(5, "sagar", "CSE");
		
		Object[] o = new Student[5];
		
		o[0] = s1;
		o[1] = s2;
		o[2] = s3;
		o[3] = s4;
		o[4] = s5;
		
		System.out.println("=======using for loop=========");
		
		for(int i = 0;i<o.length;i++) {
			System.out.println(o[i]);
		}
		
		System.out.println("==========using for each==========");
		
		for(Object i : o) {
			System.out.println(i);
		}
	}
}
