package com.collections.Sagar;

import java.util.ArrayDeque;

public class MyArrDQ {

	public static void main(String[] args) {
		ArrayDeque aq=new ArrayDeque();
		aq.add(10);
		aq.add(20);
		aq.add(30);
		aq.add(40);
		aq.add(50);
		System.out.println(aq);
		System.out.println(aq.peekFirst());
		System.out.println(aq.getLast());
		System.out.println(aq);
	}
}
