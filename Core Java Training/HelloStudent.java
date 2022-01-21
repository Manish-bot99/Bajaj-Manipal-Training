package com.bajaj.prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student //implements Comparable<Student>
{
	private int id;
	private String name;
	private String address;
	private int no;
	private int age;
	
	
	public Student(int id, String name, String address, int no, int age) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.no = no;
		this.age = age;
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", no=" + no + ", age=" + age + "]";
	}

}
	

public class HelloStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> stud = new ArrayList<Student>();
		stud.add(new Student(34, "Sneha", "Rourkela", 91293123, 21));
		stud.add(new Student(3, "Bureha", "Pune", 3012310, 34));
		stud.add(new Student(16, "Neha", "Chennai", 30324200, 43));
		stud.add(new Student(24, "Shreya", "Noida", 301200123, 17));
		stud.add(new Student(20, "Sai", "Bangalore", 123456, 19));
		stud.add(new Student(60, "Rudra", "Mumbai", 6676764, 70));
		stud.add(new Student(9, "Jay", "Jaisalmer", 986765, 27));
		
//		for(Student s:stud)
//		{
//			System.out.println(stud);
//		}
		
		Collections.sort(stud,new sortByAge());
		for(Student s:stud)
		{
			System.out.println(s);
		}
	}

}
