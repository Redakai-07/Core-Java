package com.rom.Basics;

public class Student {
//	instance variable
	String name;       
	String gender;
//	int age;
//static variable
static String institution;
	void display(String name,String gender,String institution)
	{
		int age=20; //local variable
		System.out.println(name+"\t"+gender+"\t"+institution+"\t"+age);
	}

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		s1.display("Ravi","male","Rooman");
		s2.display("Sharath","male","Rooman");
		s3.display("Priya","female","Rooman");
	}

}
