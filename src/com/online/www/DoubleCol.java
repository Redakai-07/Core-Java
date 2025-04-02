package com.online.www;


@FunctionalInterface
interface Mine{
	public void m1();
}


class Hello{
	public static void m2() {
		System.out.println("Got It");
	}
}

public class DoubleCol {

	public static void main(String[] args) {
		Mine i=Hello::m2;
		i.m1();
	}

}
