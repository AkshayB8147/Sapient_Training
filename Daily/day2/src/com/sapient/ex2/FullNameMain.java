package com.sapient.ex2;

public class FullNameMain {

	public static void main(String[] args) {
		FirstName firstName=new FirstName();
		LastName lastName=new LastName();
		
		FullName fullName=new FullName(firstName,lastName);
		System.out.println(fullName.getFullName());
		
	}

}
