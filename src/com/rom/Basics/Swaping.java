package com.rom.Basics;

public class Swaping {

	public static void main(String[] args) {
		int a=10;
		int b=30;
//		int c;
//		c=a;
//		a=b;
//		b=c;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("swaped numbers are: ");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}
