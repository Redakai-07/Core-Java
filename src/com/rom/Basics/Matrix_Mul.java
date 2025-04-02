package com.rom.Basics;
import java.util.*;
public class Matrix_Mul {

	public static void main(String[] args) {
		//Matrix Multiplication
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Rows for First Matrix: ");
		int n=sc.nextInt();
		System.out.println("Enter the Columns for First Matrix: ");
		int m=sc.nextInt();
		
		System.out.println("Enter the Rows for Second Matrix: ");
		int p=sc.nextInt();
		System.out.println("Enter the Columns for Second Matrix: ");
		int q=sc.nextInt();
		
		int[][] a=new int[n][m];
		int[][] b=new int[p][q];
		int[][] c=new int[n][q];
		
		
		if(m!=p) {
			System.out.println("Not Possible !!!");
		}
		else {
			System.out.println("Enter Elements for First Matrix: ");
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter Elements for Second Matrix: ");
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++) {
					b[i][j]=sc.nextInt();
				}
			}
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<q;j++) {
					for(int k=0;k<m;k++) {
						c[i][j]+=a[i][k]*b[k][j];
					}
				}
			}
			
			System.out.println("Resultant Matrix is : ");
			for(int i=0;i<n;i++) {
				for(int j=0;j<q;j++) {
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		}
		sc.close();
	}

}
