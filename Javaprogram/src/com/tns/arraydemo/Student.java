package com.tns.arraydemo;
//demo for class as an array
public class Student {

	int sid;
	String sname;
	String sbranch;
	public Student(int sid, String sname, String sbranch) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sbranch = sbranch;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSbranch() {
		return sbranch;
	}
	public void setSbranch(String sbranch) {
		this.sbranch = sbranch;
	}
	
}
