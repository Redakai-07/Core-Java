package com.rom.Basics;

public class Temp {
	Temp()
	{
		this(5);
		System.out.println("No parameter");
	}
	Temp(int x){
	this(5,10);
	System.out.println("Single parameter" +x);
}
	Temp(int x,int y)
{
	System.out.println("Two parameter "+(x+y));
}
	public static void main(String[] args) {
		Temp a=new Temp();
//		System.out.println("Sleeping...");
//		Thread.sleep(1000);
	}

}
