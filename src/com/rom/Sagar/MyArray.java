package com.rom.Sagar;
import java.util.*;

public class MyArray {
	int[] marks=new int[5];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MyArray m=new MyArray();
		
		
		System.out.println("Enter the Marks");
		for(int i=0;i<m.marks.length;i++) {
			System.out.println("Enter the "+(i+1)+" Element");
			m.marks[i]=sc.nextInt();
		}
		
		System.out.println("Marks Are:");
		for(int i=0;i<m.marks.length;i++) {
			System.out.print(m.marks[i]);
		}
		sc.close();
	}

}
