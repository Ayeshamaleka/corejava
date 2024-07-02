package com.tns.nestedinterface;

public class NestedInterface implements MyInterface.MyInnerInterface{

	@Override
	public void print() {
		System.out.println("Print Method of Nested Interface");
				
	}

}
