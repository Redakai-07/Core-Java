package com.rom.Basics;

abstract class Bike{
	abstract void mileage();
	static void test() {
		System.out.println("Success !!!");
	}
	void run() {
		System.out.println("Another way Success !!!");
	}
}

class Honda extends Bike{
	void mileage() {
		System.out.println("40 kmpl");
	}
}

class Yamaha extends Bike{
	void mileage() {
		System.out.println("100 kmpl");
	}
}

public class Abstract {

	public static void main(String[] args) {
		Honda h=new Honda();
		Yamaha y=new Yamaha();
//		Bike b=new Bike(); error cuz abstract class doesn't need a object since it should not carry any implementations
		h.mileage();
		y.mileage();
		Bike.test();
		Bike b=new Honda();
		b.run();
	}

}
