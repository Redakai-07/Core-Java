package com.Inheritance.Sagar;

public class Mom {

	public static void main(String[] args) {
		Son s=new Son();
		s.watch();
		
	}

}
class Dad{
	String color="Brown";
	void watch() {
		System.out.println("Watching Movies");
	}
}
class Son extends Dad{
	String color="dark";
	@Override
	void watch() {
		System.out.println("Watching Action Movies");
		System.out.println(color);
		System.out.println(super.color);
		super.watch();
	}
}