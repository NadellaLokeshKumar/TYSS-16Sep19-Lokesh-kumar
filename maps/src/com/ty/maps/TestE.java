package com.ty.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {

	public static void main(String[] args) {
		TreeMap<String, Integer> lh = new TreeMap<>();
		
		lh.put("Hariyana", 456321);
		lh.put("Bangalore", 560068);
		lh.put("patna", 880000);
//		lh.put(null, 465987);		//NullPointerException.
		
		for(Map.Entry<String, Integer> m : lh.entrySet()) {
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("key: "+key);
			System.out.println("value: "+value);
			System.out.println("==============");
		}
	}
}
