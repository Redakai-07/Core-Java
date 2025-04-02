package com.rom.Sagar;

public class Test {

	public static void main(String[] args) {
//		Car c=new Car("Baleno","4");
//		Car c1=new Car();
//		c.setCname("Baleno");
//		c.setNoofwheels("4");
//		String s=c.getCname();
//		String a=c.getNoofwheels();
//		
//		System.out.println(s);
//		System.out.println(a);
		
		Car c=new Car("Benz");
		System.out.println(c.getCname());
		System.out.println(c.getNoofwheels());
		
	}

}

class Car{
	private String cname;
	private String noofwheels;
	
	public Car() {
//		this("Baleno","4");
		System.out.println("No Argument Constructor ");
	}
	
	public Car(String cname,String noofwheels) {
//		this();
		System.out.println("Inside Para Constructor");
		this.cname=cname;
		this.noofwheels=noofwheels;
	}
	public Car(String cname) {
		this();
		this.cname=cname;
		System.out.println("Inside cname Constructor");
	}

//	public void setCname(String cname) {
//		this.cname = cname;
//	}
//	public void setNoofwheels(String noofwheels) {
//	this.noofwheels = noofwheels;
//}
	public String getCname() {
		return cname;
	}
	public String getNoofwheels() {
		return noofwheels;
	}

	
}