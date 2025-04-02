package com.rom.Basics;

public class String_ {

	public static void main(String[] args) {
		// String Methods
		String s=new String("Viraj");
		System.out.println(s.charAt(s.length()-1));
		System.out.println(s.indexOf('a'));
		System.out.println(s.length());
		System.out.println(s.substring(2));
		System.out.println(s.substring(2,3));
		System.out.println(s.contains("raj"));
		System.out.println(s.contains("V"));
		String s2=new String(" Kana");
		System.out.println(s+s2);
		System.out.println(s.concat(s2));
		System.out.println(s.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println((s.toUpperCase()).concat(s2.toLowerCase()));
		String s1=s+s2;
		System.out.println(s1);
		System.out.println(s1.replace("Viraj","Prabhath"));
	}
}
