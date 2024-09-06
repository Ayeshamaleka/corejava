package com.tns.comparator;
//demo for comparator
public class Person {

	public int age;
	public String name;
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}	
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
	
}
