package exceptions.propogation;

public class A {
public void f1() {
	System.out.println("Entered A...");
	try {
		B b=new B();
		b.f2();
	} catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println("Leaving A...");
}
}
