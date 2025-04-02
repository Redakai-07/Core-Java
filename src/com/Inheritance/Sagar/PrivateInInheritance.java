package com.Inheritance.Sagar;

public class PrivateInInheritance {

	public static void main(String[] args) {
		Hacker h=new Hacker();
		h.display();
	}
}
 class Bank{ //To prevent Hacker from hacking, add private access modifier
	int accno=123;
	int pass=456;
}
class Hacker extends Bank{
	void display() {
		pass=765;
		System.out.println(pass);
		System.out.println(accno);
	}
}