package com.collections.Sagar;

import java.util.LinkedList;

public class MyLList {

	public static void main(String[] args) {
//		LinkedList ll=new LinkedList();
//		ll.add(10);
//		ll.add(20);
//		System.out.println(ll);
//		System.out.println();
//		ll.pop();
//		System.out.println(ll);
//		ll.pop();
//		System.out.println(ll);
//		ll.getFirst();          No Such element exception
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		System.out.println(ll);
		System.out.println();
		ll.pop();
		System.out.println(ll);
		ll.pop();
		System.out.println(ll.peekFirst());
		ll.add(10);
		ll.add(20);
		ll.add(39);
		ll.add(45);
		System.out.println(ll.get(2));
	}

}
