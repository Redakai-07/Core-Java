package com.Inheritance.Sagar;

public class SingleLevel {

	public static void main(String[] args) {
		Childs c=new Childs();
		System.out.println(c.hight);
		c.read();
	}

}
class Parents{
	float hight=5.5f;
	void read() {
		System.out.println("I'm reading books");
	}
	
}
class Childs extends Parents{
	
}