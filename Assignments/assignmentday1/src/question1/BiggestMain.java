package question1;

public class BiggestMain {
	
	public static void main(String[] args) {
		Biggest b=new Biggest();
		System.out.println("Biggest number is " + b.findBiggest(1000, 100, 10));
		System.out.println("Biggest number is " + b.findBiggest(50, 97, 123));
		System.out.println("Biggest number is " + b.findBiggest(8, 100, 65));
		System.out.println("Biggest number is " + b.findBiggest(675, 76,456));
		System.out.println("Biggest number is " + b.findBiggest(566, 2569, 4768));
	}

}
