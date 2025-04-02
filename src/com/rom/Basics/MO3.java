package com.rom.Basics;

class Animal{
	
}

class Monkey extends Animal{
	
}

public class MO3 {
	public void m1(Animal b) {
		System.out.println("Animal");
	}
	public void m1(Monkey c) {
		System.out.println("Monkey");
	}
	public static void main(String[] args) {
		Animal a=new Animal();
		Monkey m=new Monkey();
		MO3 x=new MO3();
		x.m1(a);
		x.m1(m);
		Animal a1=new Monkey();
		x.m1(a1);
	}

}
