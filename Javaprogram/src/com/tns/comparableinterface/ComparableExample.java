package com.tns.comparableinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {
		List<Person> l=new ArrayList<Person>();
		l.add(new Person(12,"Sam"));
		l.add(new Person(34,"Bob"));
		l.add(new Person(23,"Neha"));
		l.add(new Person(50,"Tuba"));
		
		System.out.println("Data before sorting");
		System.out.println(l);

		for(Person p:l) {
			System.out.println(p);
		}
		
		System.out.println("Data after sorting");
		Collections.sort(l);
		
		for(Person p:l) {
			System.out.println(p);
		}
	}

}
