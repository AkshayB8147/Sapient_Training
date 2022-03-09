package com.sapient.threads;

public class Worker implements Runnable {

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
