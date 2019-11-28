package com.ty.java8features.predicate;

import java.util.function.Predicate;

public class TestA {

	public static void main(String[] args) {
		
		Predicate<Integer> p = age -> {
			if(age>=18) {
				return true;
			}else {
				return false;
			}
			
		};
		System.out.println(p.test(19));
	}
}
