package com.Strings.Sagar;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
//		int[] a= {3,6,9,10,12,15,30,90,60};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Value:");
		int n=sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("Fizz Buzz");
			}
			else if (i%5==0) {
				System.out.println("Buzz");
			}
			else if(i%3==0) {
				System.out.println("Fizz");
			}
			else {
				System.out.println("Neither Fizz Nor Buzz");
			}
		}
		
	}

}
