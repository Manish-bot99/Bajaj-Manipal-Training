package com.bajaj.prac;

import java.util.Scanner;

//cli base application
//Menu base
class Employees extends Object
{
	public int employeeID;
	public String name;
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employees(int employeeID, String name) {
		super();
		this.employeeID = employeeID;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employees [employeeID=" + employeeID + ", name=" + name + "]";
	}
	
	public void createrec(int n)
	{
		
	}
	
}

public class javaDay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("Select your choice");
			System.out.println("Enter 1 for create");
			System.out.println("Enter 2 for append");
			System.out.println("Enter 3 for delete");
			System.out.println("Enter 4 for Update");
			System.out.println("Enter 5 for Search by name");
			System.out.println("Enter 6 for Sort ASC");
			System.out.println("Enter 7 for Sort DESC");
			System.out.println("Enter 8 for Exit");
			int x = sc.nextInt();
			
			switch (x) {
			case 1:
				System.out.println("Create Menu");
				System.out.println("Enter number of employees: ");
				n = sc.nextInt();
				Employees value[] = new Employees[n];
				break;
			
			case 2:
				System.out.println("Append Menu");
				System.out.println("Enter number of records: ");
				n = sc.nextInt();
				Employees values[] = new Employees[n];
				
				break;
				
			case 3:
				System.out.println("Delete Menu");
				System.out.println("Enter employee id to be deleted: ");
				n = sc.nextInt();
				Employees value[] = new Employees[n];
				break;
			
			case 4:
				System.out.println("Update Menu");
				System.out.println("Enter employee id to be updated: ");
				n = sc.nextInt();
				Employees value[] = new Employees[n];
				break;
				
			case 5:
				System.out.println("Search Menu");
				System.out.println("Enter employee name to search: ");
				break;
			
			case 6:
				System.out.println("Sort ASC");
				
				break;
				
			case 7:
				System.out.println("Sort DESC");
				System.out.println("Enter employee id to be updated: ");
				break;
				
			case 8:
				
				break;
				
			default:
				break;
			}
		}
	}

}
