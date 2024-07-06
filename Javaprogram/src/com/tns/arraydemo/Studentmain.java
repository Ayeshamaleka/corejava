package com.tns.arraydemo;

public class Studentmain {

	public static void main(String[] args) {
		
		//int[] arr; arr is a variable with type integer
		
		Student[] arr;   //-->arr in a variable with type student(class)
		arr=new Student[3];
		arr[0]=new Student(101,"NEHA","ECE");
		arr[1]=new Student(102,"SUDHA","ECE");
		arr[2]=new Student(103,"ATESH","ECE");
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println("The elements of array"
			                    +arr[i].getSid()+","
			                    +arr[i].getSname()+","
			                    +arr[i].getSbranch());	
		}
				
	}
}
