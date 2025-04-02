package com.rom.Basics;
import java.util.*;
public class While {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Positive No's:");
		int n=0;
		int sum=0;
		while(n>=0) {
			sum+=n;
			n=sc.nextInt();
		}
		System.out.println("Sum of Positive Integers are: "+sum);
		sc.close();
	}

}
