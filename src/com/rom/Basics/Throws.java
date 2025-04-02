package com.rom.Basics;

public class Throws {

	public static void main(String[] args) throws InterruptedException{
		m();
	}
	public static void m() throws InterruptedException {
		m2();
	}
	public static void m2() throws InterruptedException {
		Thread.sleep(1000);
	}
}
