package com.tns.exceptionhandling2;
//
import java.io.IOException;

//user defined exception
public class Voter {

	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		
		try {
			Agevalidator.agevalidator(age);
		} catch (InvalidAgeException | IOException e) {
			
			e.printStackTrace();
		}
		this.age = age;
	}
	
	
	
}
