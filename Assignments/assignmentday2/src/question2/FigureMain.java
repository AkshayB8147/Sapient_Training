package question2;

public class FigureMain {
public static void main(String[] args) {
	Figure triangle=new Triangle(20,30);
	System.out.println(triangle.area());
	
	
	Figure rectangle=new Rectangle(10,100);
	System.out.println(rectangle.area());
}
}
