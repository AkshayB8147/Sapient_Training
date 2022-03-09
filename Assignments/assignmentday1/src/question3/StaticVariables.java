package question3;

class Student {
	int a; 
	static int b; 
	Student(){
		b++;
	}
	
	public void showData(){
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);
	}
}

public class StaticVariables {
	 public static void main(String args[]){
	     Student s1 = new Student();
	     s1.showData();
	     Student s2 = new Student();
	     s2.showData();
	  }
}