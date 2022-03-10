package question4;

public class PrintStack extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Executing code by "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
