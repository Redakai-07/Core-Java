package com.collections.Sagar;

import java.util.*;

public class MyIterator {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		Iterator w=al.iterator();
//		while(w.hasNext()) {
//			System.out.println(w.next());
//		}
		al.add(12);
		al.add(34);
		al.add(35);
		al.add(45);
		
		Iterator i=al.iterator();
		while(i.hasNext()) {
			if((int)i.next()%2==0)
			{
				System.out.println(i.next());
			}
		}
		System.out.println("Even elements in the Modified arrayList are: ");
//		try {
//			while(i.hasNext()) {
//				if((Integer)i.next()%2==0)
//					System.out.println(i.next());
//			}
//		}
//		catch(Exception e) {
//			System.out.println("No Even Elements Found !!!");
//		}
		al.add(null);
		System.out.println(al);
	}
}
