package com.rom.MultiThreads;

public class Yieldmethod {

	public static void main(String[] args) {
		Yield y=new Yield();
		y.start();
		for(int i=0;i<30;i++) {
			System.out.println("Main");
			try {
				Thread.sleep(1000); // Sleep and join operations should always include exception handling
				}
				catch(Exception e) {
					System.out.println("Sleep couldn't complete");
				}
		}
	}
}
class Yield extends Thread{
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println("Child");
		Thread.yield();
		for(int i=0;i<10;i++)
			System.out.println("Last");
	}
}