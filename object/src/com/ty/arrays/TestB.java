package com.ty.arrays;

public class TestB {
	public static void main(String[] args) {
		int[] nums = {10,20,30,40};
		
		String[] data = {"lokesh","naveen","karthik"};
		
		
	//	System.out.println(nums[10]);    //ArrayIndexOutOfBoundException
		
		
		receive(nums);
		int[] values = getArray();
		
		for(int val : values) {
			System.out.println(val);
		}
		
		take(data);
		
		String[] elements = getStr();
		for(String str : elements) {
			System.out.println(str);
		}
	}
	
	
	static void receive(int[] numbers) {   //array as a parameter
		
		for(int num : numbers) {
			System.out.println(num);
		}
	}
	
	static int[] getArray() {
		int[] values = {20,30,40,50};
		return values;
	}
	

	
	static void take(String[] data) {   //string array as a parameter
		for(String str : data) {
			System.out.println(str);
		}
	}
	
	static String[] getStr() {
		String[] elements = {"naveen","lokesh","vishnu"};
		return elements;
	}
}
