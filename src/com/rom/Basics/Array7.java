package com.rom.Basics;
import java.util.Arrays;
import java.util.*;
public class Array7 {
// Program to find middle point in a sorted array
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Middle element in the sorted array is :"+a[a.length/2]);
		sc.close();
	}

}
