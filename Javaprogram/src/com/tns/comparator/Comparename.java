package com.tns.comparator;

import java.util.Comparator;

public class Comparename implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
