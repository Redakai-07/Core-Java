package com.rom.Basics;

public class StackOverflow {

	public static void main(String[] args) {
		m();
	}
	public static void m() {
		m2();
	}
	public static void m2() {
		m();
	}
}
