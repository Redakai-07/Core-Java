package com.rom.Basics;

public class Trycatch {

	public static void main(String[] args) {
		System.out.println("Statement-1");
		try {
			int[] a=new int[5];
			System.out.println(a[10]);
		}
//		System.out.println("Error code"); catch should always immediately come after try
		catch(ArithmeticException babu) {
			System.out.println(babu.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException nograj) {
			System.out.println(nograj.getMessage());
			System.out.println(nograj);
			System.out.println(nograj.toString());
			nograj.printStackTrace();
		}
		catch(Exception m) {
			System.out.println("Don't Know");
		}
		finally {
			System.out.println("Statement-3");
		}
	}
}
