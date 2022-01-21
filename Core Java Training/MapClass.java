package com.bajaj.prac;
import java.util.*;

public class MapClass {
	public static void main(String args[]) {
		Map<String, Student> map = new LinkedHashMap<String ,Student>();
		map.put("a",new Student(34, "Sneha", "Rourkela", 91293123, 21));
		map.put("b",new Student(3, "Bureha", "Pune", 3012310, 34));
		map.put("v",new Student(16, "Neha", "Chennai", 30324200, 43));
		map.put("c",new Student(24, "Shreya", "Noida", 301200123, 17));
		map.put("d",new Student(20, "Sai", "Bangalore", 123456, 19));
		
//		System.out.println(map);
		
		Collection<Student> values = map.values();
		for(Student s1:values)
		{
			System.out.println(s1);
		}
		
		Set<String> keys = map.keySet();
		for(String str:keys)
		{
//			System.out.println("key as "+str +" value "+map.get(str));
			map.containsKey("a");
		}
	}
}
//map.containsKey(keys)
