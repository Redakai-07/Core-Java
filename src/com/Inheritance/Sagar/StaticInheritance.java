package com.Inheritance.Sagar;

public class StaticInheritance {

	public static void main(String[] args) {
		Scicalci.add();
	}

}
class Calculator{
	static void add() {
		System.out.println("Inside Calculator add method");
	}
}
class Scicalci extends Calculator{
//	@Override its not override its method hiding, static methods dont override
	static void add() {
		System.out.println("Inside Scientific Calci");
	}
}