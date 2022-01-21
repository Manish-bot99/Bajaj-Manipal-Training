package com.bajaj.prac;

import java.util.Comparator;

public class sortByAddress implements Comparator<Student>{
	@Override
	public int compare(Student s1, Student s2) {
		return s1.getAddress().compareTo(s2.getAddress());
	}

}
