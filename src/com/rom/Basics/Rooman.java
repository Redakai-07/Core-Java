package com.rom.Basics;

public class Rooman {
	
	String name;
	int id;
	int age;
	String gender;
	
	void add() {
		System.out.println("I'm here bro");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rooman r=new Rooman("Ravi",23,23,"Male");
		Rooman r2=new Rooman("Ravi",23,23,"Male");
		r.add();
		r2.add();
		
	}
	Rooman(String name,int id,int age,String gender){
		this.name=name;
		this.id=id;
		this.age=age;
		this.gender=gender;
		System.out.println(name+" "+id+" "+age+" "+gender);
	}

}
