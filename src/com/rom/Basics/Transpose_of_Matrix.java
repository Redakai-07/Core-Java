package com.rom.Basics;
import java.util.*;
public class Transpose_of_Matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter No of Rows: ");
		int n=sc.nextInt();
		
		int[][]a=new int[n][n];
		int[][]b=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				b[i][j]=a[j][i];
			}
		}
		
		System.out.println("Transpose Of Matrix is : ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
