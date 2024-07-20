package com.tns.comparableinterface;
//demo for comparable
public class Person implements Comparable<Person>{

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
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.age,o.age);
		//12,"Jake",34,"Bob",23,"Sam"
		//this.age--->12
		//o.age--->34
		//natural sorting--->12
		
   }

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
}
