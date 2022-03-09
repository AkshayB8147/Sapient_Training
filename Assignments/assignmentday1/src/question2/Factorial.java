package question2;

public class Factorial {
	
	public void byForLoop(int n) {
		long fact=1l;
		for (int i = n; i>0; i--) {
			fact=fact*i;
		}
		System.out.println("Factorial of the number "+ n +" is: "+ fact);
	}
	
	public void byWhileLoop(int n) {
		long fact=1l;
		int i=1;
		while (i<=n) {
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of the number "+ n +" is: "+ fact);
	}
	
}
