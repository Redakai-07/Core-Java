package com.Strings.Sagar;

public class MyString {

	public static void main(String[] args) {
//		String s1="JAVA";
//		String s2="JAVA";
//		if(s1==s2) {
//			System.out.println("References are Equal");
//		}
//		else {
//			System.out.println("Reference Not Equal");
//		}
//		if(s1.equals(s2)) {
//			System.out.println("Values are Equal");
//		}
//		else {
//			System.out.println("Values Not Equal");
//		}
		
		String s1="Rooman";
		String s2=s1+"Tech";
		String s3=s1+"Tech";
		System.out.println(s2==s3);
		System.out.println(10+20+30+"40"+"100"+100+40); // Once it encounters string, then it considers numbers as also strings
	}

}
