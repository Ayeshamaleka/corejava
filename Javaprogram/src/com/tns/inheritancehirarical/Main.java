package com.tns.inheritancehirarical;

public class Main {

	public static void main(String[] args) {
		Person p1=new Person();		
		System.out.println("------PERSON DETAILS-----");
		System.out.println(p1);
		
		Person p;
		p=new Person("Dhruv","mumbai");
		if (p instanceof Person);
		System.out.println("Person Details" +p);
		
		p=new Employee(287, 27690, "Nikhil");
		if (p instanceof Employee);
		System.out.println("Employee Details" +p);
		
		p=new Student("pankaj", 265);
		if (p instanceof Student);
		System.out.println("Student Details" +p);
			

	}

}
