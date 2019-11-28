package com.ty.sorting.set;

import java.util.Comparator;

public class SortByPincode implements Comparator<Bank>{

	@Override
	public int compare(Bank o3, Bank o4) {
		Integer i =o3.pincode;
		Integer j = o4.pincode;
		return i.compareTo(j);
	}

	
}
