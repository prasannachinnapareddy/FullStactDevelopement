package com.cts.main;
import java.util.Scanner;
public class Exceptions
{
	public static void main(String[] args) 
	{
	 public void dis() throws ArrayIndexOutOfBoundsException,NullPointerException
	{
	  try
	  {
		System.out.println("Begin");
		int a=Integer.parseInt(args[0]);
		System.out.println("Got value from user");
		if(a==10)
		{
			throw new ArithmeticException("got Arithmatic exception");
		}
		int b=10/(10-a);
		System.out.println("the result of b is:" +b);
		String s="prasanna";
		s=null;
		System.out.println("got nullpointerexcepton");
		System.out.println("the length of the string:" +s.length());
	  }
	  catch( NumberFormatException ae) 
	  {
		  System.out.println("enter a num:");
	  }
	  
     }
}
}