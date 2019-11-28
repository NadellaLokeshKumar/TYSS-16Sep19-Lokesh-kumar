package com.ty.objectclass;

public class Test {
	public static void main(String[] args) {
		
	PenDrive p = new PenDrive();
	Mouse m = new Mouse();
	USBPort.connect(p);
	USBPort.connect(m);
}
}
