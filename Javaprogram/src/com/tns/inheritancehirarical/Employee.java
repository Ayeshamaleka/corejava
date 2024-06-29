package com.tns.inheritancehirarical;

public class Employee extends Person{
	private int empid;
	private float salary;
	private String dept;
	
	public Employee() {
		System.out.println("employee class default constructor");
		
		}

	public Employee(int empid, float salary, String dept) {
		super();
		this.empid = empid;
		this.salary = salary;
		this.dept = dept;
	}
	
	
	

}
