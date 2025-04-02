package com.core.Sagar;

public class Mystatic {

	public static void main(String[] args) {
		Launch.m1();
		System.out.println(Launch.a);
		System.out.println(Launch.b);
		
		Launch l=new Launch();
		l.m2();
		System.out.println(l.x);
		System.out.println(l.y);
	}

}

class Launch{
	static int a,b;
	static {
		System.out.println("Inside static block");
		a=10;
		b=20;
//		System.out.println(x); Error since static can't access instance
//		System.out.println(y); Same as above
	}
	static void m1() {
		System.out.println("Inside static method");
	}
	
	int x,y;
	{
		System.out.println("Inside instance block");
		x=100;
		x=100;
//		System.out.println(a);
//		System.out.println(b);
	}
	void m2() {
		System.out.println("Inside instance method");
//		System.out.println(a);
//		System.out.println(b);
	}
	public Launch(){
		System.out.println("Inside default Constructor");
//		System.out.println(a);
//		System.out.println(b);
	}
}
