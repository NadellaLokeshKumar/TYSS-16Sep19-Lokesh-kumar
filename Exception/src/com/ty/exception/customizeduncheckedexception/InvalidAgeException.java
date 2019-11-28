package com.ty.exception.customizeduncheckedexception;

public class InvalidAgeException extends RuntimeException {
	String message = "Invalid age below 18 years not allowed";
	
	public InvalidAgeException() {
	
	}
	
	public InvalidAgeException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;					// or we can use toString also as mentioned below.
	}

//	@Override
//	public String toString() {
//	
//		return message;
//	}															

	
	

	
	
}
