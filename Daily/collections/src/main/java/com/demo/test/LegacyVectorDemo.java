package com.demo.test;
import java.util.Enumeration;
import java.util.Vector;
public class LegacyVectorDemo {
public static void main(String[] args) {
	Vector<String> names=new Vector<String>();
	names.addElement("John");
	names.addElement("Peter");
	names.addElement("Rahul");
	names.addElement("Chetan");
	names.addElement("Kirti");
	names.addElement("Srinivas");
	names.addElement("Rahul");
	System.out.println(names);
	
	Enumeration<String> namesEnum=names.elements();
	while(namesEnum.hasMoreElements()) {
		String name=namesEnum.nextElement();
		System.out.println(name);
	}
}
}
