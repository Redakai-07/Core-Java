package com.online.www;

@FunctionalInterface
interface hii{
	public int wow(String w);
}

public class FuncInter {

	public static void main(String[] args) {
		String s="Nice";
		hii h=w->w.length();
		System.out.println(h.wow(s));
	}

}
