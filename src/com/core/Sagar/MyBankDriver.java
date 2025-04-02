package com.core.Sagar;

import java.util.Scanner;

public class MyBankDriver {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.getaInterest();
	}

}
class Bank{
//	float p,t,si,r=2.5f;   Not efficient
	float p,t,si;
	static float r=2.5f;
	void getaInterest() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal Amount:");
		p=sc.nextFloat();
		System.out.println("Enter Time Duration");
		t=sc.nextFloat();
		si=(p*t*r)/100;
		System.out.println("Simple Interest is: "+si);
	}
}