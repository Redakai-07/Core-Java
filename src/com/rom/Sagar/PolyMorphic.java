package com.rom.Sagar;

public class PolyMorphic {

	public static void main(String[] args) {
		Micromax m=new Micromax();
		Sony s=new Sony();
		Lg l=new Lg();
		Tv t;
		t=m;
		t.Poweron();
		t.display();
		t.poweroff();
		System.out.println("***********");
		t=s;
		t.Poweron();
		t.display();
		t.poweroff();
		System.out.println("***********");
		t=l;
		t.Poweron();
		t.display();
		t.poweroff();
		System.out.println("***********");
	}

}
class Tv{
	void Poweron() {
		System.out.println("Powering On...");
	}
	void display() {
		System.out.println("TV");
	}
	void poweroff() {
		System.out.println("Powering Off...");
	}
}
class Micromax extends Tv{
	@Override
	void display() {
		System.out.println("Micromax");
	}
}
class Lg extends Tv{
	void display() {
		System.out.println("Life's Good");
	}
}
class Sony extends Tv{
	void display() {
		System.out.println("Sony");
	}
}