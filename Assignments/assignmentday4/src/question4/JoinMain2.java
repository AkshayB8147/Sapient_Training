package question4;

public class JoinMain2 {
	public static void main(String[] args) throws InterruptedException {
	System.out.println("Main Thread starts with join() ");
	Thread t3=new Thread(new PrintStack());
	Thread t4=new Thread(new PrintStack());
	t3.start();
	t3.join();
	t4.start();
	t4.join();
	
	System.out.println("Main Thread ends with join() ");
	}
}
