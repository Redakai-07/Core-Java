package com.Inheritance.Sagar;

public class Myinheritance {

	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c.hight);
		c.read();
	}

}
class Parent{
	float hight=5.5f;
	void read() {
		System.out.println("I'm reading books");
	}
	
}
class Child extends Parent{
	
}