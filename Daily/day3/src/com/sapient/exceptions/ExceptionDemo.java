package com.sapient.exceptions;

public class ExceptionDemo {
public static void main(String[] args) {
	try {
		int a=10;
		int b=0;
		double c=a/b;
		System.out.println(c);
		System.out.println("no exception");	
	}
	catch(Exception e) {
		System.out.println(e.getStackTrace());
	}
	System.out.println("program continues");
	
	}
}
