package com.rom.Basics;
import java.util.*;
public class Array1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int a[]=new int[10];
		int[] a= {1,2,3,4,5,6};
		int b[]=new int[10];
//		System.out.println("Enter No. of Elements");
//		int n=sc.nextInt();
//		System.out.println("Enter "+n+" Elements One by One:");
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//		}
		for(int i=0;i<6   ;i++) {
			b[i]=a[i];
			System.out.print(b[i]+" ");
		}
		sc.close();
	}

}
