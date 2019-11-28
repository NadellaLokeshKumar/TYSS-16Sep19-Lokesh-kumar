package com.ty.maps;

import java.util.HashMap;

public class TestB {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("kuku", 998053564);
		hm.put("mala", 6524963);
		hm.put("sheela", 57963145);
		
		HashMap hm1 = new HashMap();
		hm1.put("deepu", 77589);
		hm1.put("riya", 564239);
		hm1.put("kriti", 46597852);
		
		boolean hasKey = hm.containsKey("mala");
		System.out.println("Has Key: "+hasKey);
		
		boolean hasContains = hm.containsValue(6524963);
		System.out.println("Has Contains: "+hasContains);
		
		hm.putAll(hm1);
		
		System.out.println("=================");
		
		System.out.println("After put all "+hm);
		
		System.out.println(hm.size());
		
		boolean isEmpty = hm.isEmpty();
		System.out.println("Map is Empty "+isEmpty);
		
		hm.clear();
		System.out.println("After clear "+hm);
	}
}
