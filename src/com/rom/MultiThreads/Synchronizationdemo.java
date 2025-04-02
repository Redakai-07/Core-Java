package com.rom.MultiThreads;
class Display
{
	public  void wish(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Good Morning:");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				
			}
			System.out.println(name);
		}
	}
}
class mythread5 extends Thread
{
	Display d;
	String name;
	mythread5(Display d, String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
public class Synchronizationdemo {

	public static void main(String[] args) {
		Display d=new Display();
		mythread5 t=new mythread5(d,"virat");
		mythread5 t1=new mythread5(d,"Dhoni");
		t.start();
		t1.start();

	}

}