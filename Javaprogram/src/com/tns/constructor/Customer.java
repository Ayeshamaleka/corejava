package com.tns.constructor;

public class Customer {

	private String cname;
	private String caddress;
	private int cid;           //properties
	
	//default constructor
	public Customer() {
		System.out.println("this is default constructor");
	}
	//parameter constructor
	public Customer(String cname, String caddress, int cid) {
		this.cname=cname;
		this.caddress=caddress;
		this.cid=cid;	
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "Customer [cname=" + cname + ", caddress=" + caddress + ", cid=" + cid + "]";
	}
	
	
	
}
