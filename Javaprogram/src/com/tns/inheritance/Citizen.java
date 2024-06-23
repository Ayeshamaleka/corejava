package com.tns.inheritance;

public class Citizen {

	private String name;
	private long aadharno;
	private String address;
	private long phono;
	
	//default Constructor
	public Citizen() {
	  			
		}
		
	//parameter	
	
	public Citizen(String name, long aadharno, String address, long phono) {
		super();
		this.name = name;
		this.aadharno = aadharno;
		this.address = address;
		this.phono = phono;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAadharno() {
		return aadharno;
	}
	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhono() {
		return phono;
	}
	public void setPhono(long phono) {
		this.phono = phono;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharno=" + aadharno + ", address=" + address + ", phono=" + phono + "]";
	}
	
	
	
	
}
