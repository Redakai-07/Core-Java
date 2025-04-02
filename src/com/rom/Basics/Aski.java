package com.rom.Basics;
import java.util.Scanner;
public class Aski {

	public static void main(String[] args) {
		System.out.println("Enter any character :");
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		int b=a;
		System.out.println("Unicode value:"+b);
		sc.close();
		
	}

}
