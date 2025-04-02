package com.collections.Sagar;

import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(35);
		
		
		System.out.println(al);  //[10, 20, 35]
		al.add(90);
		al.add("Rooman");
		al.add(true);
		System.out.println(al); //[10, 20, 35, 90, Rooman, true]
		
		
		ArrayList b=new ArrayList();
		b.add(100);
		b.add(200);
		b.add(400);
		
		
		al.addAll(b);
		System.out.println(al); //[10, 20, 35, 90, Rooman, true, 100, 200, 400]
		al.addAll(2, b);
		System.out.println(al); //[10, 20, 100, 200, 400, 35, 90, Rooman, true, 100, 200, 400]
		al.add(2,true);
		System.out.println(al); //[10, 20, true, 100, 200, 400, 35, 90, Rooman, true, 100, 200, 400]
		System.out.println(al.get(3)); //100
		System.out.println(al.indexOf(100)); //3
		System.out.println(al.lastIndexOf(100));
		al.remove(new Integer(200));
		System.out.println(al);
	}
}
