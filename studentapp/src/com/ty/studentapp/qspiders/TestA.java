package com.ty.studentapp.qspiders;
import com.ty.studentapp.jspiders.*;

public class TestA {
	public static void main(String[] args) {
		
  QTP q = new QTP();
  q.teachQTP();
  
  Selenium se = new Selenium();
  se.teachSelenium();
  
 // com.ty.studentapp.jspiders.Angular a = new com.ty.studentapp.jspiders.Angular();
  Angular a = new Angular();
  a.teachAngular();
  
  React r = new React();
  r.teachReact();
  
  
}
}
