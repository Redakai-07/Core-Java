package com.Inheritance.Sagar;

public class MultiLevel {

	public static void main(String[] args) {
		C i=new C();
	    System.out.println(i.c);
	    i.read();
	}
}
class Gp{
	float c=5.5f;
	void read() {
		System.out.println("Grandpa reading");
	}
}
class P extends Gp{
	
}
class C extends P{
	
}
