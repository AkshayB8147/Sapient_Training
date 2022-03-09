package com.sapient.assignment;

public class Customer {
	private int customerId;
	private String customerName;
	private Address shippingAddress;
	
	public Customer(int customerId,String customerName,String dooNo,String city,int pinCode) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.shippingAddress=new Address(dooNo,city,pinCode);
	}
	
	public String getCustomerDetails() {
		return customerId + "  " + customerName + "  " + shippingAddress.getAddress();
	}
	
	public Address getShippingAddress() {
		return shippingAddress;
	}
	
}