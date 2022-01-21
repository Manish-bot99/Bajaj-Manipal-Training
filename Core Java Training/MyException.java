package com.bajaj.prac;

import java.io.FileNotFoundException;

class CustomException extends Exception
{
	public CustomException(String message) {
		super(message);
	}
}

public class MyException {

	public static void main(String[] args) throws FileNotFoundException
	{
		// TODO Auto-generated method stub
		int a[]= new int[1];
		try
		{
			if(a.length==1)
			{
				a[0]=1;
				a[1]=1;
				a[2]=1;
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println(a[0]);
		}
	}

}
