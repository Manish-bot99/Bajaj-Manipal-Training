package com.bajaj.prac;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {
	public static void main(String args[]) {
//		Set<Student> studset = new LinkedHashSet<Student>();
//		studset.add(new Student(34, "Sneha", "Rourkela", 91293123, 21));
//		studset.add(new Student(3, "Bureha", "Pune", 3012310, 34));
//		studset.add(new Student(16, "Neha", "Chennai", 30324200, 43));
//		studset.add(new Student(24, "Shreya", "Noida", 301200123, 17));
//		studset.add(new Student(20, "Sai", "Bangalore", 123456, 19));
//		studset.add(new Student(60, "Rudra", "Mumbai", 6676764, 70));
//		studset.add(new Student(9, "Jay", "Jaisalmer", 986765, 27));
		
		Set<Student> studset = new TreeSet<Student>(new sortById());
		studset.add(new Student(34, "Sneha", "Rourkela", 91293123, 21));
		studset.add(new Student(3, "Bureha", "Pune", 3012310, 34));
		studset.add(new Student(16, "Neha", "Chennai", 30324200, 43));
		studset.add(new Student(24, "Shreya", "Noida", 301200123, 17));
		studset.add(new Student(20, "Sai", "Bangalore", 123456, 19));
		studset.add(new Student(60, "Rudra", "Mumbai", 6676764, 70));
		studset.add(new Student(9, "Jay", "Jaisalmer", 986765, 27));
		
		studset.forEach((str)->System.out.println(str));
		
//		for(Student s:studset)
//		{
//			System.out.println(s);
//		}
	}
}
