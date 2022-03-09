package question1;

public class BirdMain {
public static void main(String[] args) {
	Bird parrot=new Parrot("parrot1");
	System.out.println(parrot.fly());
	
	Bird eagle=new Eagle("eagle1");
	System.out.println(eagle.fly());
	
	Bird duck=new Duck("duckky");
	System.out.println(duck.fly());
	
}
}
