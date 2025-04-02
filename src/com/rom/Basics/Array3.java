package com.rom.Basics;

public class Array3 {

	public static void main(String[] args) {
		int[]a= {1,2,33,4,5,2,2,1};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println(sum);
		System.out.println((float)sum/a.length);
	}

}
