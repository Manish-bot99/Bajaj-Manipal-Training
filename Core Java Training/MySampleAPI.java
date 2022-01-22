package com.bajaj.prac;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee22 implements Comparable<Employee22>
{
	private int id;
	private String name;
	private float salary;
	@Override
	public String toString() {
		return "Employee22 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Employee22(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee22 o) {
		// TODO Auto-generated method stub
		if(this.getSalary()>o.getSalary())
			return 1;
		else if(this.getSalary()<o.getSalary())
			return -1;
		else
			return 0;
	}
	
	
}

public class MySampleAPI {
	
	public static <T> Predicate<T> distinctByKey(
		    Function<? super T, ?> keyExtractor) {
		  
		    Map<Object, Boolean> seen = new ConcurrentHashMap<>(); 
		    return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null; 
		}
	
	public static void main(String args[])
	{
		List<Employee22> ls =  new ArrayList<Employee22>();
		
		ls.add(new Employee22(1001,"Nitesh",10000));
		ls.add(new Employee22(1005,"Bharti",20000));
		ls.add(new Employee22(1002,"Rahul",50000));
		ls.add(new Employee22(1004,"Ravi",15000));
		ls.add(new Employee22(1003,"Rajesh",11000));
		ls.add(new Employee22(1008,"Rohan",18000));
		ls.add(new Employee22(1006,"Ayush",20000));
		ls.add(new Employee22(1007,"Rishi",25000));
		ls.add(new Employee22(1004,"Ravi",15000));
		
		//List of Employee22 Records having name starting with R
		System.out.println("List of Employee22 Records having name starting with R");
		List<Employee22> ls1 = ls.stream()
		.filter(emp->emp.getName().startsWith("R"))
	    .collect(Collectors.toList());
		ls1.forEach(s->System.out.println(s));
		
		//Names of the Employee22 having salary more than 15000
		System.out.println("\n\nNames of Employee22 Records having salary more than 15000");
		List<String> st1 = ls.stream()
		.filter(emp->emp.getSalary()>15000)
		.map(s->s.getName())
	    .collect(Collectors.toList());
		st1.forEach(s->System.out.println(s));
		
		//Print only Employee22 ID's And salaries
		System.out.println("\n\nPrint only Employee22 ID's and Name");
		List<Employee22> st2 = ls.stream()
	    .collect(Collectors.toList());
		st2.forEach(s->System.out.println(s.getId()+" "+s.getName()));
		
		
		//Print Max Salary
		System.out.println("\n\nPrint Employee22 having maximum Salary");		
		Employee22 e1 = ls.stream().max((i,j)->i.getSalary()>j.getSalary()? 1: -1).get();
		System.out.println(e1.getSalary());
		
		//Print Min Salary
		System.out.println("\n\nPrint Employee22 having minimum Salary");		
		Employee22 e2 = ls.stream().min((i,j)->i.getSalary()>j.getSalary()? 1: -1).get();
		System.out.println(e2.getSalary());
		
		//Sort Ascending order based on the Salary
		System.out.println("\n\nSorted with Salary");	
		List<Employee22> lss=ls.stream()
		//.filter(s->s.getSalary())
		.sorted()
		.collect(Collectors.toList());
		lss.forEach(ss1->System.out.println(ss1));
		
		//Sort Ascending order based on the ID
		System.out.println("\n\nSorted with ID");	
		List<Employee22> lss1=ls.stream()
		//.filter(s->s.getSalary())
		.sorted(Comparator.comparingInt(s->s.getId()))
		.collect(Collectors.toList());
		lss1.forEach(ss1->System.out.println(ss1));
		
		//Sort Descending order based on the ID
		System.out.println("\n\nDescending Sorted with ID");	
		List<Employee22> lss2= ls.stream()
		//.filter(s->s.getSalary())
		.sorted(Comparator.comparingInt(s->((Employee22) s).getId()).reversed())
		.collect(Collectors.toList());
		lss2.forEach(ss2->System.out.println(ss2));
		
		//Print Distinct values
		System.out.println("\n\nPrint Distinct values");	
		List<Employee22> st4=ls.stream()
		.filter(distinctByKey(s->s.getName()))
		.collect(Collectors.toList());
		st4.forEach(ss1->System.out.println(ss1));
	}

}