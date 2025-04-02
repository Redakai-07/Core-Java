package com.online.www;

import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {
		Predicate<Integer> p=r->r%2==0;
		System.out.println(p.test(30));
	}

}
