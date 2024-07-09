package com.tns.exceptionhandling2;

public class Studentdetails {

	private String name;
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks)  {
		try {
			Student.student(marks);
		} catch (StudentmarksException e) {

			e.printStackTrace();
		}
		this.marks = marks;
	}
	
	
}
