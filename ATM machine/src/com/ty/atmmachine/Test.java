package com.ty.atmmachine;

public class Test {
public static void main(String[] args) {
	Machine m = new Machine();
	HDFC h = new HDFC();
	ICICI i = new ICICI();
	SBI s = new SBI();
	m.slot(h);
	m.slot(i);
	m.slot(s);
}
}
