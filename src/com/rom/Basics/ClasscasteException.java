package com.rom.Basics;

public class ClasscasteException {

	public static void main(String[] args) {
		String s=new String("Rooman");
		Object o=(Object) s;
		
		System.out.println(o);
		
//		Object o=new Object("Rooman");
//		String s=(Object) o;
//		System.out.println(s); Error cause object can't be converted into string
		
//		Number Format Exception
		int i=Integer.parseInt("10");
		System.out.println(i);
		
//		Illegal State Exception
		Thread t=new Thread();
		t.start();
		t.start();
	}

}
