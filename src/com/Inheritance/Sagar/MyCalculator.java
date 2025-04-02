package com.Inheritance.Sagar;

import java.util.Scanner;

public class MyCalculator {

	public static void main(String[] args) {
		Calculation c=new Calculation();
		Classy ca=new Classy();
		ca.numbers();
		c.calculate();
	}

}
class Classy{
	int a,b,ans;
	char c;
	void numbers() {
		System.out.println("Enter Two Numbers");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter a arithmatic symbol:");
		c=sc.next().charAt(0);
		sc.close();
	}
}
class Calculation extends Classy{
	void calculate() {
		switch(c) {
		case '+':
			ans=a+b;
			break;
		case '-':
			ans=a-b;
			break;
		case '*':
			ans=a*b;
			break;
		case '/':
			ans=a/b;
			break;
		default:
			System.out.println("Wrong ans");
		}
	}
}