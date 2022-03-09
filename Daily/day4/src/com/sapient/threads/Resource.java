package com.sapient.threads;

public class Resource{

	public synchronized void printMessage1(String message1) {

		try {
			System.out.print("["+message1);
			Thread.sleep(5000);
			System.out.println("]");  //[message]

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void printMessage2(String message2) {

		try {
			System.out.print("["+message2);
			Thread.sleep(5000);
			System.out.println("]");  //[message]

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
