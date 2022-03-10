package question8;

public class MyThread extends Thread {

	@Override
	public void run() {
		Thread t= Thread.currentThread();
		System.out.println("Priority of "+t.getName()+" is "+t.getPriority());
	}
}