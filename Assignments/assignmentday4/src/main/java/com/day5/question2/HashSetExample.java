package com.day5.question2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> capitals=new HashSet<String>();
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
