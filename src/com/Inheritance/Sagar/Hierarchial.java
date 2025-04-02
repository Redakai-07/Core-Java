package com.Inheritance.Sagar;

public class Hierarchial {

	public static void main(String[] args) {
		Cub1 c1=new Cub1();
		Cub2 c2=new Cub2();
		Cub3 c3=new Cub3();
		c1.roar();
		c2.roar();
		c3.roar();
	}

}
class Lion{
	void roar() {
		System.out.println("Roaring");
	}
}
class Cub1 extends Lion{
	
}
class Cub2 extends Lion{
	
}
class Cub3 extends Lion{
	
}
