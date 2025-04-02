package com.Inheritance.Sagar;

public class Hybrid {

	public static void main(String[] args) {
		Labrador l=new Labrador();
		Puppy1 p1=new Puppy1();
		Puppy1 p2=new Puppy1();
		Puppy1 p3=new Puppy1();
		l.bark();
		p1.bark();
		p2.bark();
		p3.bark();
	}

}
class Canine{
	void bark() {
		System.out.println("Dog is Barking");
	}
}
class Labrador extends Canine{
	
}
class Puppy1 extends Labrador{
	
}
class Puppy2 extends Labrador{
	
}
class Puppy3 extends Labrador{
	
}