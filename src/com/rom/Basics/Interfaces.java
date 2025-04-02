package com.rom.Basics;

interface Bank {
	public float rateofinterest();
}
class SBI implements Bank{
	public float rateofinterest() {
		return 9.5f;
	}
}
class HDFC{
	public float rateofinterest() {
		return 8.8f;
	}
}
public class Interfaces{
	public static void main(String[] args) {
		SBI s=new SBI();
		HDFC h=new HDFC();
		System.out.println(s.rateofinterest());
		System.out.println(h.rateofinterest());
	}
}