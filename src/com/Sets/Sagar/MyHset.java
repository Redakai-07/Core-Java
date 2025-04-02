package com.Sets.Sagar;

import java.util.*;

public class MyHset {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(20);
		System.out.println(hs.size());
		System.out.println(hs);
		
		LinkedHashSet h=new LinkedHashSet();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(20);
		System.out.println(h);
	}

}
