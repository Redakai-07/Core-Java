package com.rom.Basics;
import java.util.*;
class NotPermittedException extends Exception{
	public NotPermittedException(String str) {
		super(str);
	}
}
public class Throw {

	public static void main(String[] args) {
		System.out.println("Enter Age:");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try {
		if(age<18) {
			throw new NotPermittedException("Age not Satisfied");
		}
		else {
			System.out.println("Eligible");
		}
		}
		catch(NotPermittedException w) {
//			System.out.println(w.getMessage());
			System.out.println(w);
//			w.printStackTrace();
		}
	}
}
