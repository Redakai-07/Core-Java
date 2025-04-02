package com.rom.Basics;
import java.util.*;
public class Fibanocci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter a Number: ");
		num=sc.nextInt();
		int ans=0;
		int num1=0;
		int num2=1;
		if(num==0) {
			System.out.println("0");
		}
		if(num==1) {
			System.out.println("1");
		}
			for(int i=2;i<=num;i++) {
				ans=num1+num2;
				num1=num2;
				num2=ans;
			}
			if(num>1) {
				System.out.println(ans);
			}
			sc.close();
	}

}
