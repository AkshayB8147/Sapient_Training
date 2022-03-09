package question1;

public class Parrot extends Bird {
	public Parrot(String name) {
		super(name);
	}

	@Override
	public String fly() {
		return "Parrot named "+this.getName();
	}

}
