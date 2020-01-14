package com.cts.main;
//import java.lang.String;

import java.util.Scanner;

public class Selectionsort
{
	public static void main(String[] args)
	{
		String name= "prasanna";
		String address="guntur";
		String name1="prasanna";
		String name2= new String("prasanna");
		String address1=new String("guntur");
		String name3=new String("prasanna");
		System.out.println(address=address +"prasanna");
		System.out.println(name==name2);
		System.out.println(name.equals(name3));	
		String date="Thursday 9 jan 2010";
		String[] dates=date.split("\\d");
		for(int i=0;i<=date.length();i++)
		{
			System.out.println(dates[i]);
		}
			
	}
}
