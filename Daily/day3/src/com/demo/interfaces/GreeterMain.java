package com.demo.interfaces;

public class GreeterMain {
	public static void main(String[] args) {
		Greeter english=new EnglishGreeting();
		english.morningGreeting();
		english.eveningGreeting();
		
		Greeter french=new FrenchGreeting();
		french.morningGreeting();
		french.eveningGreeting();
	}
	
}
