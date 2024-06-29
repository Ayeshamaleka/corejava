package com.tns.staticdemo;
//execution for static variable
public class Staticmain {

	public static void main(String[] args) {
		
		//instance or object student1
		Student ob=new Student(101,"Ayesha");
		//object holds only hashcode data
		System.out.println(ob);
	
		//instance or object student2
		Student ob1=new Student(102,"Afreen");
		//object holds only hashcode data
		System.out.println(ob1);
				
		//instance or object student3
		Student ob2=new Student(103,"Neha");
		//object holds only hashcode data
		System.out.println(ob2);		
			


	}

}
