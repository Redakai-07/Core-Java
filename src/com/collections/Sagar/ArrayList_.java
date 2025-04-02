package com.collections.Sagar;
import java.util.ArrayList;

public class ArrayList_ {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(30);
		al.add(50);
		al.add(60);
		System.out.println(al);
		al.set(2, 45);
		System.out.println(al);		//Replaces the value in the arrayList
		System.out.println("Size of ArrayList is "+al.size());
		al.trimToSize();
		System.out.println(al.contains(30));
		al.add("false");
		System.out.println(al.contains("false"));
		ArrayList bl=new ArrayList();
		bl.add(30);
		bl.add(50);
		System.out.println(al.containsAll(bl));
	}

}
