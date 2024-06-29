package com.tns.inheritancehirarical;
//demo for hierarchical 
public class Person {

	private String name;
	private String city;
	
	public Person() {
		System.out.println("Person class default constructor");
		name="Ayesha";
		city="hyderabad";
				
	}

	public Person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
		
}
	
	