package com.ty.google;

public class Test {
	public static void main(String[] args) {
		Browser b = new Browser();
		Google g = new Gmail();
		Google gd = new GoogleDrive();
		b.open(g);
		b.open(gd);
	}
}
