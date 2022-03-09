package com.demo.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		
		Set<String> names=new HashSet<String>();
		
		names.add("John");
		names.add("Peter");
		names.add("Rahul");
		names.add("Chetan");
		names.add("Kirti");
		names.add("Srinivas");
		names.add("Rahul");
		System.out.println(names);
		
		Iterator<String> itr=names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		for(String name:names) {
			System.out.println("Hello "+name);
		}
	}

}
