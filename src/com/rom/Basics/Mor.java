package com.rom.Basics;

class Father{
	public void marriage() {
		System.out.println("Marriage:Shilpa");
	}
	public void property() {
		System.out.println("Property:Gold");
	}
}

class Son extends Father{
	public void marriage(Son a) {
		System.out.println("Marriage:Ramya");
	}
}

public class Mor {

	public static void main(String[] args) {
		Father f=new Father();
		Son s=new Son();
		Father x=new Son();
		f.property();
		s.property();
		f.marriage();
		s.marriage();
		s.marriage(s);
		x.marriage();
	}

}
