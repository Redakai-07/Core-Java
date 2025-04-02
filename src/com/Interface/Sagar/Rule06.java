package com.Interface.Sagar;
//A class can implement multiple interfaces cause diamond shape problems doesn't exist
public class Rule06 {

	public static void main(String[] args) {
		MyCalculator c=new MyCalculator(); 
		c.add();
		c.multiply();
		c.div();
		c.sub();
			
	}

}
interface Calc1{
	void add();
	void sub();
}
interface Calc2{
	void multiply();
	void div();
}
class MyCalculator implements Calc1, Calc2{
	public void add() {
		System.out.println("Adding");
	}
	public void multiply() {
		System.out.println("Multiplying");
	}
	public void sub() {
		System.out.println("Subbing");
	}
	public void div() {
		System.out.println("Div");
	}
}