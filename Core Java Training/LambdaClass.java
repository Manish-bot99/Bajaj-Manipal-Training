package com.bajaj.prac;

class Calc{
	int a;
	int b;
	public void sum(int a , int b)
	{
		int c = a + b;
		System.out.println(c);
	}
	public void substraction(int a, int b)
	{
		int c = a-b;
		System.out.println(c);
	}
}

interface FunctionType
{
	public void execute();
}

interface FindLengthType
{
	public int abc(String s);
}

class Evenodd
{
	public void ss(int a)
	{
		if(a%2==0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");
	}
}

public class LambdaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 10;
//		System.out.println(a);
//		
//		FunctionType code = () -> System.out.println("Hello World");
//		code.execute();
//		
//		Calc cal = new Calc();
//		cal.sum(10,20);
//		cal.substraction(20,1);
		
//		FindLengthType findtype = str -> str.length();
//		System.out.println(findtype.abc("Supppp"));
		
		Evenodd xx = new Evenodd();
		xx.ss(40);
		
	}

}
