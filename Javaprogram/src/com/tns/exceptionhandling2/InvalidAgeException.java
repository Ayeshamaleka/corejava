package com.tns.exceptionhandling2;
//demo for throw and throws
//predefined class
public class InvalidAgeException extends Exception {

	InvalidAgeException() {
		super("Invalid age");
		
	}
	InvalidAgeException(String message) {
		super(message);
		
	}
}
