package com.rom.Basics;
import java.util.*;
public class PoojaMam {

	public static void main(String[] args) {
//		LinkedList<Integer> alist=new LinkedList<Integer>();
//		alist.add(34);
//		alist.add(23);
//		alist.add(78);
//		alist.add(90);
//		alist.add(1,56);
//		alist.remove(2);
//		System.out.println(alist);
		
//		ArrayList<String> a=new ArrayList<>();
//		a.add("Chethan");
//		a.add("Ram");
//		a.add("A B");
//		System.out.println(a);
		
		Queue q=new LinkedList<>();
		q.add(34);
		q.add(54);
		q.add(44);
		q.add(64);
		System.out.println("the peek element is "+q.peek());
		System.out.println(q);
		
	}
}
