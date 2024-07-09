package com.tns.exceptionhandling2;

public class StudentmarksException extends Exception {

	StudentmarksException() {
		super("invalid marks");
		
	}
	StudentmarksException(String message) {
		super(message);
		
		
	}
}
