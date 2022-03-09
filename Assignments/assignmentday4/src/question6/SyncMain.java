package question6;

public class SyncMain {
public static void main(String[] args) {
	TestingSynchronization t=new TestingSynchronization();
	Thread t1=new Thread(t);
	Thread t2=new Thread(t);
	Thread t3=new Thread(t);
	Thread t4=new Thread(t);
	Thread t5=new Thread(t);
	Thread t6=new Thread(t);
	Thread t7=new Thread(t);
	Thread t8=new Thread(t);
	Thread t9=new Thread(t);
	
	t1.start();
	t2.start();
	t3.start();
	
	t4.start();
	t5.start();
	t6.start();
	
	t7.start();
	t8.start();
	t9.start();
}
}
