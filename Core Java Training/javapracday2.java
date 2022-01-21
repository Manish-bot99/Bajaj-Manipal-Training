package com.bajaj.prac;

class Notebook
{
	public int pages;
	public int length;
	public int width;
	public String brand;
	public Notebook(int pages, int length, int width, String brand) {
		this.pages = pages;
		this.length = length;
		this.width = width;
		this.brand = brand;
	}
	
	public void printnote()
	{
		System.out.println("Notebook Object");
		System.out.println(pages);
		System.out.println(length);
		System.out.println(width);
		System.out.println(brand);
	}
}

class Laptop
{
	public int ram;
	public int storage;
	public int weight;
	public String brand;
	public String color;
	
	public Laptop(int ram, int storage, int weight, String brand, String color) {
		super();
		this.ram = ram;
		this.storage = storage;
		this.weight = weight;
		this.brand = brand;
		this.color = color;
	}

	public void printlap()
	{
		System.out.println("Laptop Object");
		System.out.println(ram+" gb");
		System.out.println(storage+" gb");
		System.out.println(weight+" kgs");
		System.out.println(brand);
		System.out.println(color);
	}
}

class Mobile
{
	public int ram;
	public int storage;
	public int camera;
	public String brand;
	public String color;
	
	public Mobile(int ram, int storage, int camera, String brand, String color) {
		this.ram = ram;
		this.storage = storage;
		this.camera = camera;
		this.brand = brand;
		this.color = color;
	}

	public void printmob()
	{
		System.out.println("Mobile Object");
		System.out.println(ram+" gb");
		System.out.println(storage+" megapixel");
		System.out.println(camera+" kgs");
		System.out.println(brand);
		System.out.println(color);
	}
}
public class javapracday2 {
	public static void main(String args[])
	{
		Notebook obj1 = new Notebook(200,20,10,"Camlin");
		obj1.printnote();
		Laptop obj2 = new Laptop(16, 500, 2, "HP", "Silver");
		obj2.printlap();
		Mobile obj3 = new Mobile(8, 256, 64, "One Plus", "Blue");
		obj3.printmob();
	}
}
