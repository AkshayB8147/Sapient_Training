package com.day5.question5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {
	public static void main(String[] args) {
		List<StoreName> names=new ArrayList<StoreName>();
		names.add(new StoreName("Akshay"));
		names.add(new StoreName("Abhishek"));
		names.add(new StoreName("Amit"));
		names.add(new StoreName("Akash"));
		names.add(new StoreName("Mallikarjun"));
		names.add(new StoreName("Arun"));
		names.add(new StoreName("Shantveer"));
		names.add(new StoreName("Vinay"));
		names.add(new StoreName("Ganesh"));
		names.add(new StoreName("Adarsh"));
		names.add(new StoreName("Basawaraj"));
		System.out.println(names);
		names.add(5, new StoreName("Satish"));
		System.out.println(names);
		System.out.println(names.contains("Akash"));
		names.remove(10);
		System.out.println(names);
		System.out.println("-----------");
		
		Iterator<StoreName> itr=names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-----------");
		
		ListIterator<StoreName> lstItr=names.listIterator();
		while(lstItr.hasNext()) {
			System.out.println("Forward "+lstItr.next());
		}
		while(lstItr.hasPrevious()) {
			System.out.println("Backward "+lstItr.previous());
		}
		System.out.println("-----------");

		System.out.println("Using Comparator");
		Collections.sort(names, new ComparatorImpl());
		for(StoreName name:names) {
			System.out.println(name);
		}
	}
}
