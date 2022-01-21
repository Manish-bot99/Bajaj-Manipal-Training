package com.bajaj.prac;

import java.util.Comparator;

public class sortByAge implements Comparator<Student>{
	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getAge()>s2.getAge())
		{
			return 1;
		}
		else if(s1.getAge()<s2.getAge())
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
	}
}
