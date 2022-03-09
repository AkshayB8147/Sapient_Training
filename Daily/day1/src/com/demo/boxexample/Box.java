package com.demo.boxexample;

public class Box {

	private int length;
	private int breadth;
	private int height;
	private String color="no color";
	private double weight;

	public Box(int length, int breadth, int height) {
		System.out.println(" 3 param constructor");
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	public Box(int length, int breadth, int height,String color) {
		this(length,breadth,height);
		System.out.println(" 4 param constructor");
		this.color=color;
	}
	
	public Box(int length, int breadth, int height,String color,double weight) {
		this(length,breadth,height,color);
		System.out.println(" 4 param constructor");
		this.weight=weight;
	}

	public double getVolume() {
		return length * breadth * height;
	}
}
