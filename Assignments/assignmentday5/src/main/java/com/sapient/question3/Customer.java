package com.sapient.question3;

public class Customer {

	private int custId;
	private String custName;
	private String address;
	private int accountNo;
	private double balance;
	
	public Customer() {
	}

	public Customer(int custId, String custName, String address, int accountNo, double balance) {
		this.custId = custId;
		this.custName = custName;
		this.address = address;
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", address=" + address + ", accountNo="
				+ accountNo + ", balance=" + balance + "]";
	}

	
}
