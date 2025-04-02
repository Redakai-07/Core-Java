package com.Inheritance.Sagar;

public class Myworld {

	public static void main(String[] args) {
		Maricrocs c=new Maricrocs();
		c.swim();
	}
}
class Crocs{
	Animal swim() {
		Animal a=new Animal();
		System.out.println("Croc is swimming");
		return a;
	}
}
class Maricrocs extends Crocs{
	@Override
	Zebra swim() {
		Zebra b=new Zebra();
		System.out.println("MariCroc is swimming");
		return b;
	}
}
class Animal{
	void run() {
		System.out.println("Animal runs");
	}
}
class Zebra extends Animal{
	
}