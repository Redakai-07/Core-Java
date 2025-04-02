package com.Interface.Sagar;

public class Rule09 {

//	However a class extend another class and implement interface simultaneously but extending the class will be the first priority and then comes implementation
	
	public static void main(String[] args) {
		Buddy b=new Buddy();
		b.add();
		b.sub();
	}

}
interface cals{
	void add();
}
class calls{
	void sub() {
		System.out.println("Hii");
	}
}
class Buddy extends calls implements cals{
	@Override
	public void add() {
		System.out.println("Adding...");
	}
	
}