package question5.com.demo.tools;

public class Calculator {
	int a;
	int b;
	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public double add() {
		return this.a+this.b;
	}
	public double subtract() {
		return this.a-this.b;
	}
	public double multiply() {
		return this.a*this.b;
	}

}
