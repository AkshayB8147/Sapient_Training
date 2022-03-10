package com.day5.questions4;

public class BankCustomer {
private int customerId;
private String name;
private String address;
private double accBal;

public BankCustomer() {
	
}

public BankCustomer(int customerId, String name, String address, double accBal) {
	this.customerId = customerId;
	this.name = name;
	this.address = address;
	this.accBal = accBal;
}

public int getCustomerId() {
	return customerId;
}

public void setCustomerId(int customerId) {
	this.customerId = customerId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public double getAccBal() {
	return accBal;
}

public void setAccBal(double accBal) {
	this.accBal = accBal;
}

public String getDetails() {
	return this.customerId+"  "+this.name+"  "+this.address+"  "+this.accBal;
}

}
