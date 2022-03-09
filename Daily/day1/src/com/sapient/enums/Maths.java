package com.sapient.enums;

public enum Maths {

	PI(3.142),
	g(9.8);
	
	public double constValue;
	private Maths(double value) {
		this.constValue=value;
	}
	public double getConstValue() {
		return this.constValue;
	}
	
}

class TestMaths{
	
}