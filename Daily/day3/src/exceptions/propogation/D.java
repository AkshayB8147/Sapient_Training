package exceptions.propogation;

public class D {
public void f4() {
	System.out.println("Entered D...");
	try {
	int a=10;
	int b=0;
	double c=a/b;
	int d=Integer.parseInt("Akshay");
	System.out.println(c);
	}catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println("Leaving D...");
}
}
