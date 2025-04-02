package com.rom.Sagar;
import java.util.*;

public class My2dArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[2][3];
		
		
		System.out.println("Enter values:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the "+i+"th row in "+j+"th col value:");
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		System.out.println("Values are:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
