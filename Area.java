package com.cts.main;

public class Area 
{
	public static void main(String[] args)
	{
		Main main=new Main();
		main.area(2,3);
	}
}
class Main
{
		public void area(double a)
		{
			System.out.println(+(a*a));
		}
		public void area(double a,double b)
		{
			System.out.println(+(a*b));
		}
		public void area(int a,float b)
		{
			System.out.println(+(a*b)/2);
		}
	
}
