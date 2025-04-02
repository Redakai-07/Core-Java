package com.rom.Basics;

public class PP12 {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=(2*i);k++) {
				if(k==0||k==(2*i)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int p=0;p<n;p++) {
			for(int q=0;q<(2*n)-1;q++) {
				if(q==0||p==(n-1)||q==((2*n)-2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
