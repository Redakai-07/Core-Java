package com.Inheritance.Sagar;

public class FinalKeywordUnderstanding {

	public static void main(String[] args) {
		Simba s=new Simba();
		s.roar();
	}

}
//final class Lions{ error cause final class can't be inherited
class Lions{
	String lname="Scar";
//	final void roar() { error cause final method can't be overridden
	void roar() {
		System.out.println("Lion Roaring");
	}
}
class Simba extends Lions{
	@Override
	void roar() {
		System.out.println("Simba is roaring");
	}
}
