package com.rom.MultiThreads;

public class RunnableInterface {

	public static void main(String[] args) {
		myrunnable t=new myrunnable();
		Thread r=new Thread(t);
		r.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main");
		}
	}
}
class myrunnable implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child");
		}
	}
}