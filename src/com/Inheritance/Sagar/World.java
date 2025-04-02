package com.Inheritance.Sagar;

public class World {

	public static void main(String[] args) {
		Maricroc c=new Maricroc();
		c.swim();
	}
}
class Croc{
	void swim() {
		System.out.println("Croc is swimming");
	}
}
class Maricroc extends Croc{
	
//	protected or public void swim() { only access modifiers which has greater or same visibility can be implemented in the inherited method.
//	int swim() { can't even change the return type of overridden method
	@Override
	void swim() {
		System.out.println("MariCroc is swimming");
	}
}