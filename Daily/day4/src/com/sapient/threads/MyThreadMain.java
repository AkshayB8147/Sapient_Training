package com.sapient.threads;

public class MyThreadMain {
public static void main(String[] args) throws InterruptedException {
	System.out.println("Main Thread starts");
	Thread t=new Thread(new Worker());
	Thread t1=new Thread(new Worker());
//	Worker w=new Worker();
	
	t.start();
	t1.start();
	t.join();
	t1.join();
	System.out.println("Main Thread ends");
}
}
