package com.sapient.inheritance;

public class PersonMain {

	public static void main(String[] args) {
		Person akshay=new Person(110,"Akshay");
		System.out.println(akshay.getDetails());
		
		Employee e=new Employee(220, "Adarsh", 30000.0);
		System.out.println(e.getDetails());
		
		TraineeEmployee te=new TraineeEmployee(330, "Naruto", 40000.0,"Good");
		System.out.println(te.getDetails());
	}
}
