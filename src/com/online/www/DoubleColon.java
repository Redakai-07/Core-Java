package com.online.www;
@FunctionalInterface
interface Col{
	public void m1(int a,int b);
}


class Miness{
	public void s(int a,int b) {
		System.out.println(a+b);
	}
}
public class DoubleColon {

	public static void main(String[] args) {
		Miness a=new Miness();
		Col i=a::s;
		i.m1(10, 20);
	}

}
