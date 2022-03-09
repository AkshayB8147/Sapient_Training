package com.sapient.exceptions;

public class ExceptionDemo2 {
public static void main(String[] args) {
	String[] name=new String[5];
	try {
//		System.out.println(name[0].equals(0));
		name[5]="john";
	} catch (NullPointerException|ArrayIndexOutOfBoundsException e) {
//		System.out.println("Camparing with null object or no value at String index ");
		System.out.println(e);
	}
	}
}
