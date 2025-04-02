package com.rom.Basics;
import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
//		int i=30;
//		int n=4;
//		int r=(i>n)? i:n;
//		System.out.println("Result:"+r);
		System.out.println("Enter the first number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		int add=a+b;
		System.out.println("Sum is :"+add);
		sc.close();
	}

}
