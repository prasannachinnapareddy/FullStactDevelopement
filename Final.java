package com.cts.main;
public class Final 
{
	public static final double PI;
	static
	{
		PI=3.15;
	}
	/*Final()
	{
		PI=4.5;
	}
	Final(int a)
	{
		PI=5.5;
	}*/
	public static void main(String[] args)
	{
		Final x1=new Final();
		System.out.println(x1.PI);
		//Final x2=new Final(20);
		//System.out.println(x2.PI);	
	}
}