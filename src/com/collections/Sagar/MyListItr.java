package com.collections.Sagar;

import java.util.*;

public class MyListItr {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Bangalore");
		al.add("Mysore");
		al.add("Bidar");
		al.add("Koppal");
		ListIterator ltr=al.listIterator();
		System.out.println(al.size());
		while(ltr.hasNext()) {
			System.out.println("Element in "+ltr.nextIndex()+" has value "+ltr.next());
		}
		System.out.println();
		while(ltr.hasPrevious()) {
			System.out.println("Element in "+ltr.previousIndex()+" has value "+ltr.previous());
		}
		System.out.println();
		for(Object o:al)
			System.out.println(o);
		
	}
}
