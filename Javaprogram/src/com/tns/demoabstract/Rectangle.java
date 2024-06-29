package com.tns.demoabstract;

public class Rectangle extends Shape {
	
	private float width=2.3f;
	private float height=4.5f;
		
	@Override
	void calArea() {
		
		area=width*height;
	}
	

}
