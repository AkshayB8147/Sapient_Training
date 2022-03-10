package question4;

public class JoinMain {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thread starts...");
		Thread t1=new Thread(new PrintStack());
		Thread t2=new Thread(new PrintStack());
		t1.start();
		t2.start();
		System.out.println("Main Thread Ends...");
	}
}
