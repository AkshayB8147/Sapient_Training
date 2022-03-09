package com.demo.interfaces;

public class EnglishGreeting implements Greeter {

	@Override
	public void morningGreeting() {
		System.out.println("GoodMorning");
		
	}

	@Override
	public void eveningGreeting() {
		System.out.println("Good Evening");
		
	}

}
