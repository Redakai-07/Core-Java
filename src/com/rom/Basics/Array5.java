package com.rom.Basics;
import java.util.*;
public class Array5 {

	public static void main(String[] args) {
		int temp=0;
		int num=0;
		int[] a= {1,2,3,4,5,6};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		for(int i=0;i<num;i++) {
			temp=a[a.length-1];
			for(int j=a.length-1;j>=1;j--) {
				a[j]=a[j-1];
			}
			a[0]=temp;
		}
		for(int i:a) {
			System.out.print(i);
		}
		sc.close();
	}
}
