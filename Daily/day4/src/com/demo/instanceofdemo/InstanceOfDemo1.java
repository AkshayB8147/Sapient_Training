package com.demo.instanceofdemo;

class A{
	
}
class B extends A{
	
}
class C{
	
}
public class InstanceOfDemo1 {
public static void main(String[] args) {
	A a=new A();
	B b=new B();
	C c=new C();
	A ref=new B();
	
	System.out.println(a instanceof A);
	System.out.println(a instanceof B);
	System.out.println(b instanceof A);
//	System.out.println(c instanceof B);
	System.out.println(ref instanceof B);
	
}
}
