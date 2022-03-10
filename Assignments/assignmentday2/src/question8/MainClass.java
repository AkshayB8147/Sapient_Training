package question8;

public class MainClass
{
	public void display(Sample ref)
	{
		System.out.println("display of Sample ref of main");
	}

	public void display(Demo ref1)
	{
		System.out.println("display2 of Demo ref main");
	}
	public void display(Run ref2)
	{
		System.out.println("display2 of Run ref main");
	}
	public static void main(String[] args) 
	{
		Demo d1=new Demo();
		Sample s1=d1;
		Demo d2=(Demo)s1;
		d2.test();
		d2.count();

		Run r1=new Run();
		MainClass m1=new MainClass();
		m1.display(r1);
		m1.display(d1);
	}	
}