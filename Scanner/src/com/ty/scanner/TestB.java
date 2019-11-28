package com.ty.scanner;
import java.util.Scanner;
public class TestB {
	public static void main(String[] args) {
		System.out.println("scanner class");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter age");
		int age = sc.nextInt();
		System.out.println("Age is "+age);
		
		System.out.println("Are u male");
		boolean a = sc.nextBoolean();
		System.out.println(a);
	}

	
}
 