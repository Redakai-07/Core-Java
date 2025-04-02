package com.online.www;

public class Program2 {

	public static void main(String[] args) {
//		checking if the substring present in the main string
		String m="hereiamhhackerrank";
			String s="hackerrank";
			int i=0,j=0;
			while(j<s.length() && i<m.length()) {
				if(m.charAt(i)==s.charAt(j)) {
					i++;
					j++;
				}
				else {
					i++;
					j=0;
					
				}
			}
			String msg=(j==s.length())? "It contains substring" : "It doesn't contain substring";
			System.out.println(msg);
	}

}
