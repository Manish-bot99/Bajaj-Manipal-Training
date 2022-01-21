package com.bajaj.prac;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Employees{
	int rollno;
	String name;
	public Employees(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employees [rollno=" + rollno + ", name=" + name + "]";
	}
	
}

public class MyCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employees> ls = new ArrayList<Employees>();
		
		Employees.add(1,"bbc");
		Employees.add(2,"A");
		Employees.add(3,"ASSDA");
		
		System.out.println(ls);
		
//		ls.remove("A");
//		
//		if(ls.contains("bbc"))
//		{
//			System.out.println("Found");
//		}
//		ls.size();
		
		
		
		//Collections.sort(ls, Collections.reverseOrder());
		for(Employees str:ls) {
			System.out.println(str.toString);
		}
		
	}

}
