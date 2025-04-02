package com.rom.Basics;

public class Inheritance {
	public void m1(){
		System.out.println("Empty !!!");
	}
	public void m1(int i) {
		System.out.println("Integer "+i);
	}
	public void m1(char i) {
		System.out.println("Character "+i);
	}
	public static void main(String[] args) {
		Inheritance t=new Inheritance();
		t.m1();
		t.m1(4);
		t.m1('a');
	}
}

