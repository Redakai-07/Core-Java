package com.collections.Sagar;

import java.util.*;

public class MyVector {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		Enumeration er=v.elements();
		while(er.hasMoreElements()) {
			System.out.println(er.nextElement());
		}
	}

}
