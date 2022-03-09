package com.demo.jdbc.dao;

public class Emp {
	private int empId;
	private String empName;
	private String empCity;
	private double empSal;
	
	public Emp() {
		
	}

	public Emp(int empId, String empName, String empCity, double empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empCity = empCity;
		this.empSal = empSal;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	
	public String getDetails() {
		return this.empId+"  "+this.empName+"  "+this.empCity+"  "+this.empSal;
	}
	
}
