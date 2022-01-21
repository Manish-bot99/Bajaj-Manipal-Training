package com.bajaj.prac;


import java.util.Scanner;

class Employee9{
	int empid;
	String empname;
	public Employee9(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	@Override
	public String toString() {
		return "Employee9 [empid=" + empid + ", empname=" + empname + "]";
	}
}

public class newApp {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		    //initialising array
			Employee9 emp[];
			emp=new Employee9[0];
			
		while(true) {
			System.out.println("enter the input");
			System.out.println("1-create");
			System.out.println("2-insert/append");
			System.out.println("3-delete");
			System.out.println("4-update");
			System.out.println("5-search by name");
			System.out.println("6-sort ASC");
			System.out.println("7-sort DESC");
			System.out.println("8-close");
			int input=sc.nextInt();
			
		if(input==1) {
			System.out.println("enter size:");
			int size=sc.nextInt();
			emp=new Employee9[size];
			for(int i=0;i<size;i++) {
				System.out.println("enter details:");
				int id=sc.nextInt();
				String name=sc.next();
				Employee9 empi=new Employee9(id,name);
				emp[i]=empi;
			}
			for(int i=0;i<size;i++) {
				System.out.println(emp[i].toString());
			}
		}
			
		if(input==2) {
			if(emp.length==0) {
				System.out.println("First create Employee array...");
			}
			else {
				Employee9 empnew[]=new Employee9[emp.length+1];
				for(int i=0;i<emp.length;i++) {
					empnew[i]=emp[i];
				}// new array created 
				
				System.out.println("enter new input details:");
				int newid=sc.nextInt();
				String newname=sc.next();
				Employee9 empi=new Employee9(newid,newname);
				empnew[emp.length]=empi;
				
				emp=new Employee9[empnew.length];
				for(int i=0;i<emp.length;i++) {
					emp[i]=empnew[i];
				}// copied everything to old array
				for(int i=0;i<emp.length;i++) {
					System.out.println(emp[i].toString());
				}
			}
		}
		
		if(input==3) {
			if(emp.length==0) {
				System.out.println("First create Employee array...");
			}
			else {
				System.out.println("Enter id to be deleted:");
				int remove=sc.nextInt();
				int index=0;
				for(int i=0;i<emp.length;i++) {
					if(emp[i].empid==remove) {
						index=i;
						break;
					}
				}//found index
				Employee9 empnew[]=new Employee9[emp.length-1];
				for(int i=0,k=0;i<emp.length;i++) {
					if(i==index) {
						continue;
					}
					empnew[k++]=emp[i];
				}//new array after deleting
				
				emp=new Employee9[empnew.length];
				for(int i=0;i<emp.length;i++) {
					emp[i]=empnew[i];
				}//old array after deleting
				for(int i=0;i<emp.length;i++) {
					System.out.println(emp[i].toString());
				}
			}
		}
	
		if(input==4) {
			if(emp.length==0) {
				System.out.println("First create Employee array...");
			}
			else {
				System.out.println("enter id to be updated:");
				int idtobeup=sc.nextInt();
				System.out.println("enter details to be updated:");
				String nameup=sc.next();
				int update=0;
				for(int i=0;i<emp.length;i++) {
					if(emp[i].empid==idtobeup) {
						update=i;
						break;
					}
				}//found index to be updated
				emp[update].empname=nameup;
				for(int i=0;i<emp.length;i++) {
					System.out.println(emp[i].toString());
				}
			}
		}
		
		if(input==5) {
			if(emp.length==0) {
				System.out.println("First create Employee array...");
			}
			else {
				System.out.println("enter name of the person:");
				String search=sc.next();
				for(int i=0;i<emp.length;i++) {
					if((emp[i].empname).equals(search)) {
						System.out.println(emp[i].toString());
					}
				}
			}
		}
		
		if(input==6) {
			if(emp.length==0) {
				System.out.println("First create Employee array...");
			}
			else {
				for(int i=0;i<emp.length-1;i++) {
					for(int j=0;j<emp.length-i-1;j++) {
						if(emp[j].empid>emp[j+1].empid) {
							Employee9 temp;
							temp=emp[j];
							emp[j]=emp[j+1];
							emp[j+1]=temp;
						}
					}
				}
				for(int i=0;i<emp.length;i++) {
					System.out.println(emp[i].toString());
				}
			}
		}
		
		if(input==7) {
			if(emp.length==0) {
				System.out.println("First create Employee array...");
			}
			else {
				for(int i=0;i<emp.length-1;i++) {
					for(int j=0;j<emp.length-i-1;j++) {
						if(emp[j].empid<emp[j+1].empid) {
							Employee9 temp;
							temp=emp[j];
							emp[j]=emp[j+1];
							emp[j+1]=temp;
						}
					}
				}
				for(int i=0;i<emp.length;i++) {
					System.out.println(emp[i].toString());
				}
			}
		}
		
		if(input==8) {
			System.out.println("Exiting....");
			break;
		}
	}
}
}