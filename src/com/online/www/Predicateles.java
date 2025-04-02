package com.online.www;
import java.util.function.*;

public class Predicateles {

	public static void main(String[] args) {
//			Predicate<Integer> p=s->s>100;
//			if(p.test(192)) {
//				System.out.println("Greater");
//			}
//			else {
//				System.out.println("Lessser");
//			}
//		Predicate<Integer> j=y->y%2==0;
//		int[] r= {4,6,21,8,7,5,9};
//		for(int i:r) {
//			if(j.test(i)) {
//				System.out.println(i);
//			}
//		}
//		Predicate<Integer> j=y->y%2==0 && y<8;
//		int[] r= {4,6,21,8,7,5,9};
//		for(int i:r) {
//			if(j.test(i)) {
//				System.out.println(i);
//			}
//		}
		
//		Predicate<String> o=p->p.startsWith("A");
//		if(o.test("Akash")) {
//			System.out.println("Yess");
//		}
//		else {
//			System.out.println("Noooo");
//		}
		String[] s= {"Energy","Akash","Waw","Anand","Amar","Karthik","Ankith"};
		Predicate<String> t=p->p.length();
		for(String i:s) {
			if(t.test(i))
				System.out.println("Gotcha "+i);
		}
		
	}

}
