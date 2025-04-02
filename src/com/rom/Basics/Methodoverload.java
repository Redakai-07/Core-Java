package com.rom.Basics;

public class Methodoverload {
	
	public void m1(int ...i) {
		System.out.println("var-args:");
	}
	public void m1(int i) {
		System.out.println("General Integer");
	}
	public static void main(String[] args) {
		Methodoverload i=new Methodoverload();
		i.m1(10,20,30);
		i.m1();
		i.m1(10);
	}
}
