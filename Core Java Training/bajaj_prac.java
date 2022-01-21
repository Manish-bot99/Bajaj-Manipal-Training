package com.bajaj.prac;

class A
{
	public int a;
	public A(int a)
	{
		this.a=a;
	}
}

class B extends A
{
	public int b;
	public B(int a, int b)
	{
		super(a);
		this.b=b;
	}
	public void printB()
	{
		System.out.println(a);
		System.out.println(b);
	}
}

class C extends A
{
	public int c;
	public C(int a, int c)
	{
		super(a);
		this.c=c;
	}
	public C(int a)
	{
		super(a);
	}
	public void printC()
	{
		System.out.println(a);
		System.out.println(c);
	}
}
 
class D extends C
{
	int d;
	public D(int c,int d)
	{
		super(c);
		this.d=d;
	}
	public void printD()
	{
		System.out.println(a);
		System.out.println(c);
		System.out.println(d);
	}
}

public class bajaj_prac {
	public static void main(String args[])
	{
//		B obj1 = new B(10,15);
//		obj1.printB();
//		C obj2 = new C(20,30);
//		obj2.printC();
		D obj3 = new D(22,44);
		obj3.printC();
		
		obj3.printD();
	}
}       