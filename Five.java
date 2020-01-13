package com.cts.main;

import java.util.Scanner;
/*
 Write a Program to accept the age of the user and then, display the category of the
   user. Based on the age, the categories of the users are:
	05-12 Children
	13-19 Teenagers
	20-35 Young adults
	36-45 Mature adults
	46-55 Elders
	56 and above Seniors
	
 */
public class Five {
		public static void main(String[] args)
		{
			int age;
			Scanner s=new Scanner(System.in);
			age=s.nextInt();
			if((age>=5) && (age<=12))
			{
				System.out.println("Children");
			}
			else if((age>12) && (age<=19))
			{
				System.out.println("Teenagers");
			}
			else if((age>19) && (age<=35))
			{
				System.out.println("Youngadults");
			}
			else if((age>35) && (age<=45))
			{
				System.out.println("Metureadults");
			}
			else if((age>45) && (age<=55))
			{
				System.out.println("Elders");
			}
			else
				System.out.println("Seniors");
		}
}