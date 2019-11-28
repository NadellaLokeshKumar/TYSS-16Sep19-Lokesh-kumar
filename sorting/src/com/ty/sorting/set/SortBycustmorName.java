package com.ty.sorting.set;

import java.util.Comparator;

public class SortBycustmorName implements Comparator<Custmor>{

	@Override
	public int compare(Custmor o1, Custmor o2) {
		
		return o1.name.compareTo(o2.name);
	}

	
}
