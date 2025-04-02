package com.rom.Basics;
import java.util.*;
public class A2array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Rows for the Matrix: ");
		int n=sc.nextInt();
		System.out.println("Enter the number of Columns for the Matrix: ");
		int m=sc.nextInt();
		int[][] a=new int[n][m];
		int[][] b=new int[n][m];
		int[][] c=new int[n][m];
		System.out.println("Enter Elements for First Matrix: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Elements for Second Matrix: ");
		for(int p=0;p<n;p++) {
			for(int q=0;q<m;q++) {
				b[p][q]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Sum of the two Matrix are: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
