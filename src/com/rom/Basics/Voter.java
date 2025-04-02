package com.rom.Basics;

import java.util.Scanner;

public class Voter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the age of the person");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
			if(n>=18)
			{
				System.out.println("The person is eligible to vote");
				System.out.println("Enter the nationality");
				String i=sc.next();
				if(i.equals("indian"))
				{
					System.out.println("Person belong to India");
			}
				else
				{
					System.out.println("Person is not Indian");
				}
			}
			else
			{
				System.out.println("Person is not eligible to vote");
			}
		
		sc.close();
	}

}
