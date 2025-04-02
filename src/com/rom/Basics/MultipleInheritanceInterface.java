package com.rom.Basics;

interface Mango{
	public void cost();
}

interface grapes{
	public void cost();
	public void color();
}

class Seasonfruit implements Mango,grapes{
	public void cost(){
		System.out.println("100/kg");
	}
	public void color() {
		System.out.println("Grape: Green or Blue");
	}
}

public class MultipleInheritanceInterface {

	public static void main(String[] args) {
		Seasonfruit s=new Seasonfruit();
		s.cost();
		s.color();
	}

}
