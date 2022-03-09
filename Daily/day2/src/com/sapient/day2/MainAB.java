package com.sapient.day2;

public class MainAB {

	public static void main(String[] args) {
		B b=new B();
		A a=new A(b);
		a.call();

	}

}
