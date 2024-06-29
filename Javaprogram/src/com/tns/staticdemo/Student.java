package com.tns.staticdemo;
//demo for Static keyword
public class Student {
	
	//instance variables
	private int sid;
	private String sname;
	//static variable
	private static String collegename="shadan";
	
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ",collegename="+collegename+"]";
	}
	
}
