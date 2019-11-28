package com.ty.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<>();
		lh.put("Bangalore", 560068);
		lh.put("Hariyana", 456321);
		lh.put("patna", 880000);
		
		System.out.println(lh);
		
		Set<String> s = lh.keySet();			// to get all the keys.
		
		for(String key : s) {
			System.out.println("key: "+key);
			
		}
		
		System.out.println("====================");
		
		Collection<Integer> c = lh.values();		//to get all the values.
		
		for(Integer value : c) {
			System.out.println("Value: "+value);
		}
		
	}
}
