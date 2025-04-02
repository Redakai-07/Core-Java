package com.rom.Basics;
import java.util.*;
public class Arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int sum=0,sum1=0;
		System.out.println("Enter number of Rows: ");
		int n=sc.nextInt();
		int[][]a=new int[n][n];
		System.out.println("Enter the Elements: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}	
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				sum+=a[i][j];
				sum1+=a[j][i];
			}
			System.out.println("sum of "+(i+1)+" row is :"+sum);
			System.out.println("sum of "+(i+1)+" Column is :"+sum1);
			sum=0;
			sum1=0;
		}
		sc.close();
	}

}
