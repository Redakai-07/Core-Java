package com.Interface.Sagar;

import java.util.Scanner;

public class InterfaceClaci {

	public static void main(String[] args) {
//		Calculator c = new Calculator();

		Calci1 c1 = new Calci1();
		Calci2 c2 = new Calci2();
		Calci3 c3 = new Calci3();
//		Calculator c;
		casio.Calc(c1);
		casio.Calc(c2);
		casio.Calc(c3);
//		c=c1;
//		c.add();
//		c.sub();
//		c2.add();
//		c2.sub();
//		c3.add();
//		c3.sub();

	}

}

interface Calculator{
	public abstract void add();
	public abstract void sub();

}
class casio{
static	void Calc(Calculator c) {
		c.add();
		c.sub();
	}
}
 class Calci1 implements Calculator{

	@Override
	public void add() {
		int x=10,y=20;
		System.out.println("the calci1 sum is"+(x+y));
	}

	@Override
	public void sub() {
		int x=100,y=60;
		System.out.println("the calci1 minus is "+(x-y));
	}
	
}
 
 class Calci2 implements Calculator{

	@Override
	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1 and num2");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("the addtition in calci2 is"+(x+y));
	}

	@Override
	public void sub() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1 and num2");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("the substraction in calci2 is"+(x-y));		
	}
	 
 }
 
 class Calci3 implements Calculator{

	@Override
	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1 and num2");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("the add in calci3 is"+(x+y));
		
	}

	@Override
	public void sub() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1 and num2");
		int x = sc.nextInt();
		int y = sc.nextInt();
//		System.out.println(");		
		if(x==0) {
			System.out.println("values cannot be zero");
		}
		else {
			System.out.println("the substraction in calci3 is"+(x-y));
		}
	}
 }
 
	
