package com.demo.boxexample;

public class BoxMain {

	public static void main(String[] args) {
		
		int x=10;
		
		Box b = new Box(10,20,30);
		System.out.println("Volume = "+b.getVolume());
	
		Box b2 = new Box(10,20,30,"red");
		
		
	}

}
