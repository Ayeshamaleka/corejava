package com.tns.demoexception;

import java.util.HashSet;

public class DemoHashset {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		System.out.println("the elements in hashset"+hs);
	}

}
