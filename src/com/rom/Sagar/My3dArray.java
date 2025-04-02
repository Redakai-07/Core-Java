package com.rom.Sagar;
import java.util.*;
public class My3dArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][][] a=new int[2][2][3];
		
		
		System.out.println("Enter the Values");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int j2 = 0; j2 < a[i][j].length; j2++) {
					System.out.println("Enter the "+i+"th block "+j+"th row and "+j2+"th col value:");
					a[i][j][j2]=sc.nextInt();
				}
			}
		}
		
		System.out.println("Values are:");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int j2 = 0; j2 < a[i][j].length; j2++) {
					System.out.print(a[i][j][j2]+"  ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		sc.close();
	}

}
