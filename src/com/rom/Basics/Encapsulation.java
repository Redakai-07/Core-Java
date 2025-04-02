package com.rom.Basics;

class Shrihari{
	private String name="Virat";
	public String getName(){
		return name;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Shrihari s=new Shrihari();
		System.out.println(s.getName());
	}
}
