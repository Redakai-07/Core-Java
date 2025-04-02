package com.Interface.Sagar;

public class Rule08 {

	//An interface can extend another interface. Not only this, it can inherit from multiple interfaces because diamond shape problem doesn't exist.
	//Multiple inheritance in Java can be indirectly achieved by making use of interface
	
	public static void main(String[] args) {
		Drive d=new Drive();
		d.add();
		d.sub();
		d.mul();
		d.div();
	}

}
interface Calcis1{
	void add();
	void sub();
}
interface Calcis2{
	void mul();
}
interface Calcis3 extends Calcis1,Calcis2{
	void div();
}
class Drive implements Calcis3{

	@Override
	public void add() {
		System.out.println("HI");
	}

	@Override
	public void sub() {
		System.out.println("Hello");
	}

	@Override
	public void mul() {
		System.out.println("My");
	}

	@Override
	public void div() {
		System.out.println("God");
	}
	
}
