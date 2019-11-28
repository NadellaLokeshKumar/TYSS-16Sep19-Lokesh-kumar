package com.ty.objectclass;

public class TestB {
	public static void main(String[] args) {
		Pen p = new Pen();
		int pHashCode = p.hashCode();
		System.out.println("hash code value of p is "+pHashCode);
		
		Pen q = new Pen();
		int qHashCode = q.hashCode();
		System.out.println("hash code value of q is "+qHashCode);
		}
}
