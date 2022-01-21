package com.bajaj.prac;

import java.util.Comparator;

public class sortById implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getId()>s2.getId())
		{
			return 1;
		}
		else if(s1.getId()<s2.getId())
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
	}


}
