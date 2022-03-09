package exceptions.propogation;

public class B {
	public void f2() {
		System.out.println("Entered B...");
		try {
			C c=new C();
			c.f3();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Leaving B...");
	}
}
