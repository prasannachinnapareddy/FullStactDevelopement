package com.cts.main;

import java.util.Scanner;

public class Courses
{
	public static void main(String[] args)
	{
		int p=0;
		
		System.out.println("1.java       5000");
		System.out.println("2.java       3000");
		System.out.println("3.java       2000");
		System.out.println("4.java       1000");
		System.out.println("5.java       500");
		StringBuffer sb=new StringBuffer();
		System.out.println("enter the choices");
		Scanner s=new Scanner(System.in);
		String ch=s.nextLine();
		String choice=ch;
		if(ch.contains("java"))
		{
			sb.append("java        5000");
			p=p+5000;
		}
		if(ch.contains("c"))
		{
			sb.append("c       3000");
			p=p+3000;
		}
		if(ch.contains("c++"))
		{
			sb.append("c++        2000");
			p=p+2000;
		}
		if(ch.contains("python"))
		{
			sb.append("java        1000");
			p=p+1000;
		}
		if(ch.contains("angular"))
		{
			sb.append("angular        50");
			p=p+50;
		}
		System.out.println(sb);
		System.out.println(p);
    }
}
