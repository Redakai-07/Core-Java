package com.rom.MultiThreads;

public class Synchronization {

	public static void main(String[] args) {
		Mthread t=new Mthread();
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main");
		}
	}
}
class Mthread extends Thread{
	public synchronized void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println("Wrong");
			}
		}
	}
}