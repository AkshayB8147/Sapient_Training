package com.demo.test;
import java.util.List;
import java.util.Vector;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo {
public static void main(String[] args) {

//	List<String> names=new ArrayList<String>();
//	List<String> names=new LinkedList<String>();
	List<String> names=new Vector<String>();
	
	
	names.add("John");
	names.add("Peter");
	names.add("Rahul");
	names.add("Chetan");
	names.add("Kirti");
	names.add("Srinivas");
	System.out.println(names);
	
	names.add(3,"Raju");
	
	System.out.println(names.get(5));
			names.remove(2);
	System.out.println(names);
	System.out.println(names.contains("Srinivas"));
	
	Iterator<String> itr=names.iterator();
	
	System.out.println(itr);
	
	while(itr.hasNext()) {
		String name=itr.next();
		System.out.println("Hello "+name);
	}
	
	for(String name:names) {
		System.out.println("Hi "+name);
	}

	ListIterator<String> lstItr=names.listIterator();
	
	while(lstItr.hasNext()) {
		System.out.println("Forward "+lstItr.next());
	}
	
	while(lstItr.hasPrevious()) {
		System.out.println("Backward "+lstItr.previous());
	}
	
//	List<String> name=new ArrayList<String>();
//	name.add("Akshay");
//	name.add("Naruto");
//	name.add("Eren");
//	name.add("Abhinav");
//	name.add("raju");
//	System.out.println(name);
//	
//	name.add(3,"Richard");
//	System.out.println(name);
//	
//	name.remove(2);
//	System.out.println(name);
	
	
	
}
}
