package com.ty.java8features;

import java.util.function.Function;

public class TestC {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f = i -> i*i;
		
		int res = f.apply(5);
		System.out.println(res);
		
		int res1 = f.apply(4);
		System.out.println(res1);
	}
}
