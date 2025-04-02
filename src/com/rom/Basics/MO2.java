package com.rom.Basics;

public class MO2 {

	public void m1(int i, float f){
		System.out.println("int-float");
	}
	public void m1(float f,int i){
		System.out.println("float-int");
	}
	public static void main(String[] args) {
		MO2 m=new MO2();
		m.m1(10, 10.5f);
		m.m1(10.0f, 10);
//		m.m1(10, 10);	Error cause compiler doesnot know which one to auto promote
	}
}
