package com.ty.arrays;

public class TestA {
	public static void main(String[] args) {
		
		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		
		for(int i = 0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("**********************");
		
		for(int i : nums) {
			System.out.println(i);
		}
		
		System.out.println("**********************");
		
		char[] ch = {'a','b','c','d'};
		
		for(int i = 0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		
		System.out.println("**********************");
		
		for(char i : ch) {
			System.out.println(i);
		}
		
		System.out.println("**********************");
		
		byte[] num = {1, 2, 3, 4};
		for(int i = 0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		System.out.println("**********************");
		
		
		for(byte i : num) {
			System.out.println(i);
		}
		
		System.out.println("**********************");
		
		
		long[] l = {10l, 20l, 30l ,40l};
		for(int i = 0;i<l.length;i++) {
			System.out.println(l[i]);
		}
		
		System.out.println("**********************");
		
		
		for(long lo : l) {
			System.out.println(lo);
		}
		
		System.out.println("**********************");
		
		String[] str = {"lokesh", "naveen", "karthik"};
		for(int i = 0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		
		System.out.println("**********************");
		
		for(String s : str) {
			System.out.println(s);
		}
		
		System.out.println("**********************");
		
		boolean[] b = {true, false, true};
		
		for(int i = 0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
	}
}
