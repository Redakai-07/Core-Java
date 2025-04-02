package com.collections.Sagar;
import java.util.LinkedList;

public class Llist {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("asd");
		ll.add(12);
		ll.add(423);
		ll.add(34);
		System.out.println(ll);
		ll.addFirst(34);			//Adds element to the first position
		System.out.println(ll);
		ll.addLast(45);				//Adds element to the first position
		System.out.println(ll);
		System.out.println(ll.getFirst());		//prints the first element
		System.out.println(ll.getLast());		//prints the last element
		
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println(ll.peek());
		System.out.println();
		
		System.out.println(ll.pollFirst());		//removes first element
		System.out.println(ll);
		
		System.out.println(ll.pollLast());		//removes last element
		System.out.println(ll);
		ll.add(null);
		System.out.println(ll);
		
	}

}
