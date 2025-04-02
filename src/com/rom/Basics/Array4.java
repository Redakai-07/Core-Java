package com.rom.Basics;

public class Array4 {
//check the frequency of element in an array
	public static void main(String[] args) {
		int a[]= {2,5,7,5,7,18,8,10,2,7,4,7,4,3};
		int count=1;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]!=0 & a[i]==a[j]) {
					count++;
					a[j]=0;
				}
			}
			if(a[i]!=0)
			System.out.println(a[i]+" appears "+count+" times");
			count=1;
		}
			
	}
}
