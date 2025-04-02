package com.online.www;

import java.util.function.Predicate;

public class PredicateInFunc {

	public static void main(String[] args) {
		Predicate<Integer> p=i->i%2==0;
		Predicate<Integer> q=j->j>8;
		int[] ar= {5,6,7,8,98,2,1,9,99};
		m1(p,ar);
		System.out.println("2nd");
		m1(p.negate(),ar);
		System.out.println("3rd");
		m1(q,ar);
		System.out.println("4th");
		m1(q.negate(),ar);
		System.out.println("5th");
		m1(p.and(q.negate()),ar);
	}
		public static void m1(Predicate<Integer> p,int[] ar) {
			for(int i:ar) {
				if(p.test(i))
					System.out.println(i);
			}
		
	}

}
