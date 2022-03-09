package day3.com.demo.ex;

public class App {
	final int num=10;
	public final void show() {
		System.out.println("show method");
	}

}

class App2 extends App{
	public void dummy() {
//		num=20
	}
}

class Main{
	public static void main(String[] args) {
		App2 app2=new App2();
		app2.dummy();
	}
}