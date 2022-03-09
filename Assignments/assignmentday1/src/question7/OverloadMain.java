package question7;

public class OverloadMain {
	public int hello(int i) {
		System.out.println("hello method with int");
		return i;
	}
	
	public byte hello(byte i) {
		System.out.println("hello method with byte");
		return i;
	}
	
	public short hello(short i) {
		System.out.println("hello method with short");
		return i;
	}
	
	public long hello(long i) {
		System.out.println("hello method with long");
		return i;
	}
	
	public static void main(String[] args) {
		OverloadMain d = new OverloadMain();
		d.hello(5);
	}
}