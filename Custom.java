package com.cts.main;

public class Custom
{
	public static boolean show(String name) throws Invaliduser
	{
		if(!name.equals("adm"))
		{
			throw new Invaliduser();
		}
		return true;
	}
	public static void main(String[] args)
	{
		try
		{
			show("admin");
		}
		catch(Invaliduser e)
		{
			System.out.println(e.dis());
		}
	}
}
class Invaliduser extends Exception
{
	Invaliduser()
	{
		
	}
	Invaliduser(String s)
	{
		System.out.println(s);
	}
	public String dis()
	{
		return "this is inavalid";
	}
}