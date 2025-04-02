package com.Inheritance.Sagar;

public class ObjectClassIsMotherOfAllClass{

	public static void main(String[] args) {
		Maridog d=new Maridog();
		d.bark();
	}
}
class Dog{
//	class dog by default extends object class
//	protected Dog(){				constructor can be of any access modifier
//		System.out.println();
//	}
	void bark() {
		System.out.println("Barking...");
	}
}
class Maridog extends Dog{
	
}