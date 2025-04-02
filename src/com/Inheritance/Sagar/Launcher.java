package com.Inheritance.Sagar;

public class Launcher {

	public static void main(String[] args) {
		CargoPlane c=new CargoPlane();
		c.takeoff();
		c.fly();
		c.land();
		c.cargo();
		System.out.println("*****************");
		
		PassengerPlane p=new PassengerPlane();
		p.takeoff();
		p.fly();
		p.land();
		p.passenger();
		System.out.println("*****************");
		
		FighterPlane f=new FighterPlane();
		f.takeoff();
		f.fly();
		f.land();
		f.weapon();
		System.out.println("*****************");
		Plane pref;
		pref=c;
		c.fly();
		pref=p;
		p.fly();
		pref=f;
		f.fly();
	}

}
class Plane{
	void takeoff() {
		System.out.println("Taking Off");
	}
	void fly() {
		System.out.println("Flying");
	}
	void land() {
		System.out.println("Landing");
	}
}
class CargoPlane extends Plane{
	void fly() {
		System.out.println("Cargo Plane Flying");
	}
	void cargo() {
		System.out.println("Carrying Cargo");
	}
}
class PassengerPlane extends Plane{
	void fly(){
		System.out.println("Passenger Plane flying");
	}
	void passenger() {
		System.out.println("Carrying Passenger");
	}
}
class FighterPlane extends Plane{
	void fly() {
		System.out.println("Fighter Plane Flying");
	}
	void weapon() {
		System.out.println("Carring Weapons");
	}
}