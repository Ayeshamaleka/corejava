package com.tns.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.tns.comparableinterface.Person;

public class ComparatorMain {

	public static void main(String[] args) {
		
		List<Person> l=new ArrayList<Person>();

		l.add(new Person(45,"Kishore"));
		l.add(new Person(24,"Lavanya"));
		l.add(new Person(2,"SAM"));
		l.add(new Person(15,"John"));
		
		System.out.println("Data before sorting");
	
		for(Person p:l) {
			System.out.println(p);
		}

		System.out.println("Data After sorting Age");
	//	Collections.sort(l, new CompareAge());
		
				
		for(Person p:l) {
			System.out.println(p);
	//	Collections.sort(l, new Comparename() );
		}

		}

}
