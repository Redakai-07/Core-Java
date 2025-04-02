package com.online.www;

import java.util.function.Predicate;

public class ClearingNull {

	public static void main(String[] args) {
		
		String[] str= {"","",null,"Hello",null,"Hi"};
		Predicate<String> i=s->(s==null || s.length()==0);
		for(String j:str) {
			if(i.negate().test(j)) {
				System.out.println(j);
			}
		}
	}

}
