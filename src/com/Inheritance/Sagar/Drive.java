package com.Inheritance.Sagar;

//class Mystring extends String{ String method has final so can't be extended
//	
//}

public class Drive {

	public static void main(String[] args) {
		Circle c=new Circle();
		System.out.println(Circle.PI);
//		c.pi=3.141213f; error cause PI is constant and can't be altered
	}

}
class Circle{
	static final float PI=3.14285f;
	void calarea() {
		System.out.println("Area Calculating....");
	}
}

