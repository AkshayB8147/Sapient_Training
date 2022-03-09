package com.day5.question3;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
	public static void main(String[] args) {
		SortedSet<String> capitals=new TreeSet<String>();
		capitals.add("Delhi");
		capitals.add("Hyderabad");
		capitals.add("Patna");
		capitals.add("Bangalore");
		capitals.add("Mumbai");
		capitals.add("Jaipur");
		capitals.add("Chennai");
		capitals.add("Lucknow");
		capitals.add("Dehradhun");
		capitals.add("Kolkata");
		System.out.println(capitals);		
		capitals.add("Hyderabad");
		capitals.add("Delhi");
		System.out.println(capitals);

		System.out.println(capitals.contains("Hyderabad"));
		capitals.remove("Dehradhun");
		System.out.println(capitals);
		System.out.println("-----------");
		
		Iterator<String> itr=capitals.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-----------");
		
		for(String capital:capitals) {
			System.out.println(capital);
		}		
	}
}
