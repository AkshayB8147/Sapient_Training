package com.sapient.staticex;

public class Duck {
	static int duckCount;
	
	public Duck() {
		Duck.duckCount++;
	}
	static {
		System.out.println("Static block exected");
	}
	
	public static void f1() {
		System.out.println("this is a static method");
		//getDuckName();
	}
	public void getDuckName() {
		
	}
}
