package question1;

public class Eagle extends Bird {
	public Eagle(String name) {
		super(name);
	}

	@Override
	public String fly() {
		return "Eagle named "+this.getName();
	}

}
