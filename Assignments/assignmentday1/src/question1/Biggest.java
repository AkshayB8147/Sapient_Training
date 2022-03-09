package question1;

public class Biggest {
	public int findBiggest(int a,int b,int c) {
		if(a>b && a>c) {
			return a;
		}else if(b>a && b>c) {
			return b;
		}else {
			return c;
		}
	}

}
