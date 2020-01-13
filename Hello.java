package com.cts.main;

import java.util.Scanner;
/*
 Write a Program that accepts a number and checks whether it's positive, negative, or
   zero.
 */
public class Hello
{
	public static void main(String[] args) 
	{
	    int x;
	    Scanner s= new Scanner(System.in);
	    x=s.nextInt();
	    if(x>0)
	    {
	    System.out.println("positive");
	    }
	    else if(x==0)
	    	System.out.println("negitive");
	    else
	    	System.out.println("zero");
    }
}
