package com.rom.Basics;
import java.util.*;
public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String :");
		String a=sc.next();
		String rev="";
		for(int i=a.length()-1;i>=0;i--) {
			rev=rev+a.charAt(i);
		}
		if(a.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		sc.close();
	}
}
