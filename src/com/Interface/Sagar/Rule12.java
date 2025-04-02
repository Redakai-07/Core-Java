package com.Interface.Sagar;

public class Rule12 {
	
// An object of an interface can't be created because an interface is an collection of abstract methods.
// However references can be created so that loose coupling, polymorphism and its advantages can be achieved.
	
	public static void main(String[] args) {
		SbiAtm s=new SbiAtm();
		CanaraAtm c=new CanaraAtm();
		KaveriAtm k=new KaveriAtm();
		
		Orion.useAtm(s);
		Orion.useAtm(c);
		Orion.useAtm(k);
			
	}
}

interface atm{
	void deposit();
	void withdraw();
	void check();
}
class SbiAtm implements atm{
	@Override
	public void check() {
		System.out.println("Sbi Check");
	}
	@Override
	public void withdraw() {
		System.out.println("Sbi withdraw");
	}
	@Override
	public void deposit() {
		System.out.println("Sbi Deposit");
	}
}
class CanaraAtm implements atm{
	@Override
	public void check() {
		System.out.println("Canara Check");
	}
	@Override
	public void withdraw() {
		System.out.println("Canara withdraw");
	}
	@Override
	public void deposit() {
		System.out.println("Canara deposit");
	}
}
class KaveriAtm implements atm{
	@Override
	public void check() {
		System.out.println("Kaveri check");
	}
	@Override
	public void withdraw() {
		System.out.println("Kaveri withdraw");
	}
	@Override
	public void deposit() {
		System.out.println("Kaveri deposit");
	}
}
class Orion{
	 static void useAtm(atm a) {
		a.check();
		a.deposit();
		a.withdraw();
	}
}