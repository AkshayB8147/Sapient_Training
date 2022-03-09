package question4;

public class StaticMain {
	static int id = 20; 
	public static void main(String[] args) 
	{ 
		StaticMain s = new StaticMain();  
		int a = s.id; 
	    System.out.println(a);  
	    System.out.println(StaticMain.id); 
	} 
	
//	static int a = 0; 
//	StaticMain() 
//	{ 
//		a++;
//	} 
//	
//	void display() 
//	{ 
//		System.out.println(a); 
//	}
//	
//	public static void main(String[] args) { 
//		StaticMain c1 = new StaticMain(); 
//		c1.display(); 
//		StaticMain c2 = new StaticMain(); 
//		c2.display(); 
//		StaticMain c3 = new StaticMain(); 
//		c3.display(); 
//	} 
}
	
	