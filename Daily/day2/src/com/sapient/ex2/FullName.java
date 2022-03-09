package com.sapient.ex2;

public class FullName {
	FirstName firstName;
	LastName lastName;
	public FullName(FirstName firstName,LastName lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public String getFullName() {
		return firstName.getFirstName()+" "+lastName.getLastName();
	}
}
