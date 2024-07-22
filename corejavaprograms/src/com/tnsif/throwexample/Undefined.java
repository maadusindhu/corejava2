package com.tnsif.throwexample;

import java.util.Scanner;
public class Undefined {
	private static int age;
	static void validate()throws Age{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		if(age<18) 
			throw new Age("invalid age your are not eligible");
			else 
				System.out.println("you can vote");
		}
		public static void main(String[]args)
		{
			try {
				Undefined.validate();
				
			}
			catch(Age e) {
				System.out.println("caught exception"+e.getMessage());
			}
		}
		}
