package com.cts.main;

import java.util.Scanner;
/*
  Write a Program to accept hours and number of resources and display the total
   number of productive hours. (Total number of productive hours = hours * number of
   resources).
 */
public class Four {
	public static void main(String[] args)
	{
		int h,n,tp;
		Scanner s=new Scanner(System.in);
		h=s.nextInt();
		n=s.nextInt();
		tp=h*n;
		System.out.println(tp);
	}
}
