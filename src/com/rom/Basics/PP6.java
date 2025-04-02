package com.rom.Basics;

public class PP6 {

	public static void main(String[] args) {
		char a='A';
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(a);
				a++;
			}
			System.out.println();
		}
	}
}
