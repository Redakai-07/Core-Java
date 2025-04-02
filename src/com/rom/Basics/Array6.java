package com.rom.Basics;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		// Program to remove Duplicate in an array
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int a[]=new int[10];
		for(int i=0;i<num;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]==a[i]) {
					for(int k=j;k<a.length-1;k++)
						a[k]=a[k+1];
				}
			}
		}
		for(int i=0;i<num;i++) {
			if(a[i]!=0)
			System.out.print(a[i]);
		}
		sc.close();
	}

}
