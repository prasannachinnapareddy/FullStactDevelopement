package com.cts.main;

import java.util.Scanner;
/*
 Write a Program to accept three numbers and to display the largest of the three numbers.

 */
public class Third {
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if((a>b) && (a>c))
		{
			System.out.println("a is large" +a);
		}
		else if((b>a) && (b>c))
			System.out.println("b is large" +b);
		else
			System.out.println("c is large" +c);
	}

}
