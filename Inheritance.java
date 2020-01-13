package com.cts.main;

import java.util.Scanner;

public class Inheritance
{
 public static void main(String[] args)
 {
	 Employee employee=new Employee();
	 employee.getdata();
	 employee.display();
	 Manager m=new Manager();
	 m.getmanager();
	 m.displaymanager();
	 Developer developer=new Developer();
	 developer.getdeveloper();
	 developer.displaydeveloper();
 }
}
class Employee
{
	int id;
	String name;
	String company;
	public void display()
	{
		System.out.println(+id +name +company);
	}
	public void getdata()
	{
		System.out.println("enter id");
		Scanner scanner=new Scanner(System.in);
		id=Integer.parseInt(scanner.nextLine());
		System.out.println("enter name");
		name=scanner.nextLine();
		System.out.println("enter company");
		company=scanner.nextLine();		
	}
	class Manager extends Employee
	{
		int i;
		String team[]=new String[3];
		String dep;
		team=new String[3];
		public void getmanager()
		{ 
		  System.out.println("Team memebers are:");
		  Scanner s=new Scanner(System.in);
		  for(i=0;i<3;i++)
		  {
			  team[i]=s.nextLine();
			  System.out.println(team[i]);
		  }
		  System.out.println("enter department");
		  dep=s.nextLine();
		}
		public void displaymanager()
		{
			for(i=0;i<3;i++)
			System.out.println(team[i]);
			System.out.println(dep);
		}
	 }
	class Developer extends Employee
	{
		String projectname;
		String domain;
		public void getdeveloper()
		{ 
		  Scanner s1=new Scanner(System.in);
		  System.out.println("enter projectname:");
		  projectname=s1.nextLine();
		  System.out.println("enter domainname:");
		  domain=s1.nextLine();
		}
		public void displaymanager()
		{
			System.out.println(+projectname +domain);
		}
		
	}
}