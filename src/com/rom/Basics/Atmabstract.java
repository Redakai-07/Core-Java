package com.rom.Basics;

abstract class Atm{
	abstract void passwordchange();
	abstract void balance();
	static void help() {
		System.out.println("Hello");
	}
}

class Pass extends Atm{
	void passwordchange() {
		System.out.println("Change Successfull");
	}
	static void help() {
		System.out.println("Help is on the Way :)");
	}
	void balance() {
		System.out.println("Recharge karle Bhai..");
	}
}

abstract class Help extends Atm{
	static void help() {
		System.out.println("Did you call for Help ??");
	}
	abstract void passwordchange();
	abstract void balance();
}

public class Atmabstract {

	public static void main(String[] args) {
		Pass p=new Pass();
		p.passwordchange();
		p.balance();
		Pass.help();
		Help.help();
		Atm.help();	
	}
}
//abstract class Atm {
//    abstract void passwordchange();
//    abstract void balance();
//    // Remove 'static' keyword from abstract method
//    // abstract static void help();
//    // Instead, move the static method to a regular method
//    static void help() {
//        System.out.println("Help is on the Way :)");
//    }
//}
//
//class Pass extends Atm {
//    void passwordchange() {
//        System.out.println("Change Successful");
//    }
//    // Override balance method
//    void balance() {
//        System.out.println("Recharge karle Bhai..");
//    }
//    static void help() {
//    	System.out.println("I Envy you");
//    }
//}
//
//abstract class Help extends Atm {
//    // Implement abstract methods
//    abstract void passwordchange();
//    abstract void balance();
//    
//    // Override static help method
//    static void help() {
//        System.out.println("Did you call for Help ??");
//    }
//}
//
//public class Atmabstract {
//    public static void main(String[] args) {
//        Pass p = new Pass();
//        p.passwordchange();
//        p.balance();
//        
//        // Call static help method from Atm class
//        Atm.help();
//        // Call static help method from Help class
//        Help.help();
//        Pass.help();
//    }
//}