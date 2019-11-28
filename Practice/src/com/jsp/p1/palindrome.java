package com.jsp.p1;

public class palindrome {
 public static void main(String[] args) 
 {
	String str1="madam";
	int i;
	int j=str1.length()-1;
	int flag=0;
	
	for( i=0;i<((str1.length())/2);i++)
	{
		 if(str1.charAt(i)!=str1.charAt(j--))
		 {
			 flag=1;
			 break;
		 }
	}
	
	if(flag==0)
		System.out.println("its palindrome");
	else
		System.out.println("not palindrome");
	}
	

}
