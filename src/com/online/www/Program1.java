package com.online.www;

public class Program1 {

	public static void main(String[] args) {
		int[] ar= {3,5,2,1,4};
		int sum=1;
		for(int i:ar) {
			sum=sum*i;
		}
		System.out.println("Total Product: "+sum);
		System.out.println("**********************");
		System.out.println("Required ans are:");
		int[] arr=new int[5];
		
		for(int i=0;i<ar.length;i++) {
			arr[i]=sum/ar[i];
			System.out.print(arr[i]+" ");
		}
	}
}
