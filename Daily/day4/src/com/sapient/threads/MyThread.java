package com.sapient.threads;

public class MyThread extends Thread{
@Override
public void run() {
	for(int i=1;i<=10;i++) {
		System.out.println("Executing code by "+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}
