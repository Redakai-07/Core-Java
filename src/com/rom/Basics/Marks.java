package com.rom.Basics;

import java.util.*;
public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Marks");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=35)
		{
			System.out.println("Fail");
		}
		else if(n<=55){
			System.out.println("Third");
			}
		else if(n<=65) {
			System.out.println("Second");
		}
		else if(n<=80) {
			System.out.println("First");
		}
		else 
		{
			System.out.println("Distinction");
		}
		sc.close();
	}

}
