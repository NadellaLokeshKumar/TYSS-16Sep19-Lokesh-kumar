package com.ty.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<>();
		lh.put("Bangalore", 560068);
		lh.put("Hariyana", 456321);
		lh.put("patna", 880000);
		
		for(Map.Entry<String, Integer> m : lh.entrySet()) {
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("Key: "+key+"---------"+"value: "+value);
		}
	}
}
