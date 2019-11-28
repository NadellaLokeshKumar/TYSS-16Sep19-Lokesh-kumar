package com.ty.assignment.objectarray;

public class Primitives {

	public static void main(String[] args) {
		
		Object[] arr = new Object[10];
		
		arr[0] = 10;
		arr[1] = "lokesh";
		arr[2] = true;
		arr[3] = 28.57;
		arr[4] = 25.6f;
		arr[5] = 5201563l;
		arr[6] = 'M';
		
		System.out.println("=======using for loop==========");
		
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("====using for each======");
		
		for(Object o : arr) {
			System.out.println(o);
		}
	}
}
