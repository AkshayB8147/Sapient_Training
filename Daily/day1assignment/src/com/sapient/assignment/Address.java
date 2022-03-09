package com.sapient.assignment;

public class Address {
	private String doorNo;
	private String city;
	private int pinCode;
	
	public Address(String doorNo, String city, int pinCode) {
		this.doorNo = doorNo;
		this.city = city;
		this.pinCode = pinCode;
	}
	
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}


	public String getAddress() {
		return doorNo + "  " + city + "  " + pinCode;
	}
	
}
