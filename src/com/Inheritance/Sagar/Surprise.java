package com.Inheritance.Sagar;

public class Surprise {

	public static void main(String[] args) {
		Cubs c=new Cubs(100);
	}
}
class Lionness{
	public Lionness() {
//		super(); goes to object class
		System.out.println("Inside Parent");
	}
}
class Cubs extends Lionness{
	public Cubs() {
//		super(); goes to Lionness
		System.out.println("Inside Child");
	}
	public Cubs(int x) {
		this(); // Either this() or super() should be in a Constructor we can't put both
		System.out.println("Inside Parameterized Constructor Of Cubs");
	}
}
