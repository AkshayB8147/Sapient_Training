package com.sapient.threads;

public class ResourceMain {
public static void main(String[] args) {
	Resource r=new Resource();
	Thread t1=new Thread(new CallingResource(r, "Hello","this is t1 message"));
	Thread t2=new Thread(new CallingResource(r, "Hi","this is t2 message"));
	Thread t3=new Thread(new CallingResource(r, "Good","this is t3 message"));
	Thread t4=new Thread(new CallingResource(r, "Better","this is t4 message"));
	
	t1.start();
	t2.start();
	t3.start();
	t4.start();
}
}
