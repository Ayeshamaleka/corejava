package com.tns.comparator;

import java.util.Comparator;

//Demo for age comparison
public class CompareAge implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
	return Integer.compare(o1.getAge(), o2.getAge());
	}

}
