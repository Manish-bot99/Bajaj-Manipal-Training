package com.bajaj.prac;

import java.util.*;
import java.util.stream.*;

public class MyStreamPractice {

	public static void main(String[] args) {
		// Count, Min, Max, Filter, Map, Collectors, Distinct, Sort
		
		//1. Count
		List<String> ls = new ArrayList<String>();
		ls = Arrays.asList("Mayank", "Ameesh", "Harsh", "Nikhil", "Prince", "Mohit", "Priya", "Ananya", "Mohit");
		long count = ls.stream().count();
		System.out.println("Number of elements "+count);
		
		//2. Max
		Optional<String> maxS = ls.stream().max((i,j)->i.compareTo(j));
		System.out.println("\nLexicographically maximum string = "+ maxS.get());
		
		//3. Min
		Optional<String> minS = ls.stream().min((i,j)->i.compareTo(j));
		System.out.println("\nLexicographically minimum string = "+ minS.get());
				
		//4. Filter
		// Example 1 - with distinct
		Collection<String> filterCollect = ls.stream().filter(name->name.startsWith("M")).distinct().collect(Collectors.toList());
		long countM = ls.stream().filter(name->name.startsWith("M")).distinct().count();
		System.out.println("\nNames that start with 'M' are (distinct):");
		filterCollect.forEach(str->System.out.println(str));
		System.out.println("Total names(distinct) that start with M are = "+countM);
		
		// Example 2
		Collection<String> namesEndWithA = ls.stream().filter(name->name.endsWith("a")).collect(Collectors.toList());
		System.out.println("\nNames ending with 'a' are:");
		namesEndWithA.forEach(name->System.out.println(name));
		long countA = ls.stream().filter(name->name.endsWith("a")).count();
		System.out.println("Total names that end with 'a' are = "+countA);
		
		//5. Map
		//Example 1 - filter+map
		List<String> mapList = ls.stream().filter(st->st.length()>5).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println("\nNames with length > 5 converted to upperCase");
		mapList.forEach(name->System.out.println(name));
		
		// Example 2 - Filter+distinct+map
		List<String> distinctList = ls.stream().filter(name->name.length()<=5).distinct().map(name->name.toLowerCase()).collect(Collectors.toList());
		System.out.println("\nNames(distinct) with length <= 5 converted to lower case:");
		distinctList.forEach(name->System.out.println(name));
		
		//6. Sort
		//Example 1 - Ascending order
		List<String> sortedNames = ls.stream().sorted().collect(Collectors.toList());
		System.out.println("\nNames in ascending order - "+sortedNames);
		
		// Example 2 - Descending order
		List<String> descendingOrder = ls.stream().sorted(new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		}).collect(Collectors.toList());
		System.out.println("\nNames in descending order - "+descendingOrder);
		
		// Filter + Max
		// Max name with length>5
		Optional<String> maxNameLength6 = ls.stream().filter(name->name.length()>5).max((i,j)->i.compareTo(j));
		System.out.println("\nLexicographically maximum name with length > 5: "+maxNameLength6.get());
		
		// Min name with length>5
		Optional<String> minNameLength6 = ls.stream().filter(name->name.length()>5).min((i,j)->i.compareTo(j));
		System.out.println("\nLexicographically minimum name with length > 5: "+minNameLength6.get());
		
		// Max name with length<=5
		Optional<String> maxNameLength5 = ls.stream().filter(name->name.length()<=5).max((i,j)->i.compareTo(j));
		System.out.println("\nLexicographically maximum name with length <= 5: "+maxNameLength5.get());
		
		// Min name with length<=5
		Optional<String> minNameLength5 = ls.stream().filter(name->name.length()<=5).min((i,j)->i.compareTo(j));
		System.out.println("\nLexicographically minimum name with length <= 5: "+minNameLength5.get());
	}
}