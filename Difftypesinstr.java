package com.cts.main;

public class Difftypesinstr 
{
	public static void main(String[] args)
	{
	String name="Global Warming";
	StringBuffer sd=new StringBuffer(name);
	System.out.println(name.substring(10));
	System.out.println(name.substring(4,8));
	System.out.println(name.matches("[a-zA-Z0-9]+"));
	System.out.println(name.substring(4));
	System.out.println(name.substring(10));
	System.out.println(name.indexOf("Wa"));
	System.out.println(name.toUpperCase());
	System.out.println(name.toLowerCase());
	System.out.println(name.replace("a","*"));
	}
}