package com.tns.markerinterface;
//demo for marker interface
public class Student implements Register{
	
	private int sid;
	private String sname;
	private String branch;
	
	public Student(int sid, String sname, String branch) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.branch = branch;
	}
		
	
}
