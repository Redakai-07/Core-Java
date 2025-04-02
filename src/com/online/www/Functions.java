package com.online.www;
//import java.util.*;
import java.util.function.Function;

public class Functions {

	public static void main(String[] args) {
//		Function<String, String> f=s->s.toUpperCase();
//		Function<String, String> g=s->s.substring(0, 9);
//		
//		System.out.println(f.apply("Hello"));
//		System.out.println(g.apply("wowadsdfsdf"));
//		System.out.println(f.andThen(g).apply("Beautiful"));
//		System.out.println(g.compose(f).apply("asdhaskdjasd"));
		
		Function<Integer, Integer> f=s->s*s;
		Function<Integer, Integer> f1=s->s+s;
		System.out.println(f.andThen(f1).apply(10));
		System.out.println(f.compose(f1).apply(10));
		
	}

}
