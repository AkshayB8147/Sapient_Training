package com.demo.test;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.SortedSet;

public class SortedSetDemo {
public static void main(String[] args) {
		
		SortedSet<String> names=new TreeSet<String>();
		
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
