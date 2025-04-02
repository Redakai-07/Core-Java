package com.rom.MultiThreads;

public class Demo {

	public static void main(String[] args) {
		Child d=new Child();
		d.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main");
		}
	}
}

class Child extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child");
		}
	}
}