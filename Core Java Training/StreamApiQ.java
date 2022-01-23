package com.bajaj.prac;

import java.util.*;

public class StreamApiQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Q1");
		List<String> str1 = Arrays.asList("Pune", "Mumbai", "Chennai", "Bangalore", "Noida");
		str1.stream().filter(str -> str.length() > 5).forEach(System.out::println);

		System.out.println("\nQ2");
		List<String> peopleName = Arrays.asList("Atul", "Rishab", "Akshay", "Suresh");
		peopleName.stream().filter(people -> people.endsWith("h")).forEach(System.out::println);

		// Alternate
		String arr[] = { "Atul", "Rishab", "Akshay", "Suresh" };
		for (String str : arr) {
			if (str.endsWith("h")) {
				System.out.println(str);
			}
		}

		System.out.println("\nQ3");
		List<String> airlineName = Arrays.asList("AirIndia", "Vistara", "SpiceJet", "Indigo", "AirAsia");
		airlineName.stream().map(name -> name.length()).forEach(System.out::println);

		System.out.println("\nQ4");
		List<Integer> sumElement = Arrays.asList(5, 7, 13, 9, 1);
		Optional<Integer> total = sumElement.stream().filter(num -> num > 2).reduce((num1, num2) -> num1 + num2);
		System.out.println(total.get());

		System.out.println("\nQ5");
		List<Integer> maxValue = Arrays.asList(6, 7, 2, 5);
		Optional<Integer> value = maxValue.stream().reduce((num1, num2) -> num1 > num2 ? num1 : num2);
		System.out.println(value.get());
	}

}