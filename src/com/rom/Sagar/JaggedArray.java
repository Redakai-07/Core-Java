package com.rom.Sagar;
import java.util.*;
public class JaggedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] a=new int[2][];
		a[0]=new int[3];
		a[1]=new int[2];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Enter the "+i+"th row and "+j+"th col value:");
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Given Values are:");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}

}
