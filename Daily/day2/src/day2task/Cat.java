package day2task;

public class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}
	@Override
	public void talk() {
		System.out.println("Cat named "+ super.getName()+" meows...");
	}

}
