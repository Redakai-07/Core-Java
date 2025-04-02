package com.rom.Sagar;

public class Testor {

	public static void main(String[] args) {
		Scicalci s=new Scicalci();
		s.add(3);
	}

}
class Calci{
	void add(int a) {
		System.out.println("Inside single value int");
	}
}
class Scicalci extends Calci{
	
	void add(int a,int b) {
		System.out.println("Inside two Integer Value");
	}
}
