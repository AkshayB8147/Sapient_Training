package com.sapient.threads;

public class CallingResource implements Runnable {
	private Resource resource;
	private String message1;
	private String message2;
	
	
	
public CallingResource(Resource resource, String message1,String message2) {
		this.resource = resource;
		this.message1 = message1;
		this.message2 = message2;
	}



@Override
public void run() {
	resource.printMessage1(this.message1);	
	resource.printMessage2(this.message2);
}
}
