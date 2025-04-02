package com.rom.Basics;
import java.util.*;
public class Count_words {
	public static void main(String[] args) {
		// Count the Words in a String
		Scanner sc=new Scanner(System.in);
		String s=new String();
		System.out.println("Enter a String");
		s=sc.nextLine();
		String[] a=s.split(" ");
		System.out.println(a.length);
		sc.close();
	}

}
