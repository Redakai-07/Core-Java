package com.rom.Basics;

public class Watermelon {
String cut;
String griend; //these are the properties
Float weight;


void pieces()
{
	System.out.println("watermelon is done into pieces");
}
void juice()			// these is a method
{
	System.out.println("watermelon in liquid form");
}
void liter()
{
	System.out.println("it is around 5liter");
}

public static void main(String[] args)
{
	Watermelon w=new Watermelon();
	w.pieces();
	w.juice();
	w.liter();
}
}
