package exceptions.propogation;

public class C {
public void f3() {
	System.out.println("Entered C...");
	try {
		D d=new D();
		d.f4();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Leaving C...");
}
}
