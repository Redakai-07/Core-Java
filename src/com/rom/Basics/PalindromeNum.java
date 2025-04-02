package com.rom.Basics;
import java.util.*;
public class PalindromeNum {

	public static void main(String[] args) {
				int n,rev=0,temp;
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the number");
			     n=sc.nextInt();
				temp=n;
				int rem=0;
			
				while(n>0)
				{
					rem=n%10;
					rev=(rev*10)+rem;
					n=n/10;
				}
				System.out.println(rev);
				if(temp==rev)
					System.out.println("is palindromenumber");
				else
					System.out.println("not palindrome");
				sc.close();
			}
		}

