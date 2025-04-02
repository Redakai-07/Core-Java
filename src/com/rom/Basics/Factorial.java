package com.rom.Basics;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		int ans=1;
		System.out.println("Enter a Number:");
		num=sc.nextInt();
		for(int i=num;i>=1;i--) {
			ans=ans*i;
		}
		System.out.println("Factorial of "+num+" is "+ans);
		sc.close();
	}

}
