package com.tns.exceptionhandling2;
//demo for throw and throws
import java.io.IOException;

public class Agevalidator {
	
	public static void agevalidator(int age) 
			throws InvalidAgeException,IOException{
		
		if(age<18)
			throw new InvalidAgeException("The entered age is not eligible to vote");
			
	}

}
