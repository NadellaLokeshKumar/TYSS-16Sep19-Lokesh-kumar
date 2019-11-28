package com.ty.maps;

import java.util.HashMap;

public class TestA {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("kuku", 998053564);
		hm.put("mala", 6524963);
		hm.put("sheela", 57963145);
		hm.put(null, 463315);
		hm.put(null, 89654123);
		
		System.out.println("Data "+hm);
		
		hm.put("mala", 58698456);			// it repalces the old object. so duplicates are not allowed for "key" .
		System.out.println("After modify "+hm);
		
		hm.put("dimple", 998053564);
		System.out.println("after dimple "+hm);  //for "values" duplicate allowed.
		
		System.out.println("After null "+hm);
		
		System.out.println("==================");
		
		System.out.println("After adding duplicate null "+hm);
		
		System.out.println("==================");
		
		Object phoneno = hm.get("sheela");  		//if key there, gives the value.
		System.out.println("value "+phoneno);
		
		System.out.println("===============");
		
		System.out.println("value "+hm.get("lokesh"));		//key not there, so gives null.
		
		
		Object value = hm.remove("kuku");		//removes thet value.
		
		System.out.println("value "+value);
		
		
		
		
	}
}
