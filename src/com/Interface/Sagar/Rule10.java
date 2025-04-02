package com.Interface.Sagar;

public class Rule10 {

//	A interface can contain constant variable and method signatures. A variable within an interface is automatically public static final.
	
	public static void main(String[] args) {
		System.out.println(Controlroom.pol);
	}

}
interface Controlroom{
	int pol=100;
}
class Citizen implements Controlroom{

}