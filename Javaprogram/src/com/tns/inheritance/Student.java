package com.tns.inheritance;

public class Student extends Citizen{
	
	private int rollno;
	private String collegename;
	
	public Student() {
		
	}
	public Student(int rollno, String collegename) {
		super();
		this.rollno = rollno;
		this.collegename = collegename;
	}
	
	public Student(String name,long aadharno, String address,long phono) {
		super(name,aadharno,address,phono);
		
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	@Override
	public String toString() {
		return super.toString() +"Student [rollno=" + rollno + ", collegename=" + collegename + "]";
	}
	
	
	
	

}
