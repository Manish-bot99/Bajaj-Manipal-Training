package com.bajaj.prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Characters{
	private int id;
	private String name;
	private String place;
	private String ability;
	private float rating;
	public Characters(int id, String name, String place, String ability, float rating) {
		super();
		this.id = id;
		this.name = name;
		this.place = place;
		this.ability = ability;
		this.rating = rating;
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
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getAbility() {
		return ability;
	}
	public void setAbility(String ability) {
		this.ability = ability;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	
}

public class StreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Stream<I> stream = Stream.empty();
		
		Collection<Integer> coll = Arrays.asList(100,200,400,1000);
		
//		coll.forEach(str -> System.out.println(str));
		
		Stream<Integer> streamofCollection = coll.stream();
		
//		streamofCollection
//		.filter(a->a==1000)
//		.forEach(s -> System.out.println(s));
		
//		streamofCollection = 
//		.filter(a->a==1000)
//		.collect(Collectors.toList());
		
		List<Characters> ls= new ArrayList<Characters>();
		
		ls.add(new Characters(22, "Sage", "China", "Healing", 22.3f));
		ls.add(new Characters(3, "Pheonix", "USA", "Fire", 34.3f));
		ls.add(new Characters(16, "KillJoy", "Germany", "Instruments", 43.3f));
		ls.add(new Characters(24, "Jett", "Korea", "Knives", 17.2f));
		ls.add(new Characters(1, "Reyna", "Spain", "Huntress", 19.4f));
		
		List<Integer> ls1=ls.stream()
		.filter(student->student.getAge()>20)
//		.map(s->s.getId())
//		.collect(Collectors.toList());
		
		ls1.forEach(s->System.out.println(s));
	}

}
