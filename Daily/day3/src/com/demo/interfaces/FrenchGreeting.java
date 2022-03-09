package com.demo.interfaces;

public class FrenchGreeting implements Greeter {

	@Override
	public void morningGreeting() {
		System.out.println("Bonjour");
		
	}

	@Override
	public void eveningGreeting() {
		System.out.println("Bonsoir");
		
	}

}
