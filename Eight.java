package com.cts.main;

import java.util.Scanner;

/*
 You have to write a Program that accepts the product name and quantity as input
   and displays the total price using the unit prices already stored in the system.
 */

public class Eight {
	public static void main(String[] args)
	{
		String s1,s2,s3;
		int q,tp;
		Scanner s=new Scanner(System.in);
		s1=s.nextLine();
		s2=s.nextLine();
		s3=s.nextLine();
		q=s.nextInt();
		if(s1.equals("prasanna"))
		{
			tp=q*10;
			System.out.println(tp);
		}
		if(s2.equals("sai"))
		{
			tp=q*11;
			System.out.println(tp);
		}
		if(s3.equals("suji"))
		{
			tp=q*12;
			System.out.println(tp);
		}
	}
}