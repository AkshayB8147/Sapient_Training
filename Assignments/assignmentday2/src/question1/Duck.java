package question1;

public class Duck extends Bird {
	
	public Duck(String name) {
		super(name);
	}

	@Override
	public String fly() {
		return "Duck named "+this.getName();
	}
}
