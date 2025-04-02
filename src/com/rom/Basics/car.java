package com.rom.Basics;

public class car {
String color;
String model;
String mileage;
void start()
{
	System.out.println("Car has stared");
}
void move()
{
	System.out.println("Car is moving");
}
void stop()
{
	System.out.println("Car has stopped");
}
public static void main (String[] args)
{
	car c=new car();
	c.start();
	c.move();
	c.stop();
	
}
}

