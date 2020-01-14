package com.cts.main;

import java.util.Scanner;

/*
 The management of LearnMore University is planning to automate the University management system.
  Therefore, Steve Wilkinson, the programmer, has decided to create a Java program that accepts the student details,
  such as the first name, last name, age, course enrolled, and student ID. In addition, he also needs to accept the employee details,
  such as first name, last name, age, salary, department name, designation, and employee ID. Steve must ensure the reusability of code.
   The program must offer a choice to accept either the student's or employee's details. Help Steve to develop the program.
 */
public class Steve
{
	public static void main(String[] args)
	{
		int option;
		System.out.println("enter choices:");
		Scanner scanner=new Scanner(System.in);
		option=scanner.nextInt();
		Student student=new Student();
		E e=new E();
		switch(option)
		{
		   case 1:
			   	  student.get();
			   	  student.dis();
			   	  break;
		   case 2:
			      e.get();
			      e.dis();
			      break;
		  default:
			  	  System.out.println("invalid");
			  	  break;
	    }
	}
}
class Student
{
	String firstname,lastname,courseenrolled;
	int age,studentid;
	public void get()
	{
		System.out.println("enter the firstname:");
		Scanner s=new Scanner(System.in);
		firstname=s.nextLine();
		System.out.println("enter the lasttname:");
		lastname=s.nextLine();
		System.out.println("enter the course:");
		courseenrolled=s.nextLine();
		System.out.println("enter age:");
		age=Integer.parseInt(s.nextLine());
		System.out.println("enter id:");
		studentid=Integer.parseInt(s.nextLine());
	}
	public void dis()
	{
		System.out.println("student details:"+firstname +lastname +courseenrolled +age +studentid);
	}
}
class E extends Student
{
	String firstname,lastname,departmentname,designation;
	int age,eid;
	public void get()
	{
		System.out.println("enter the firstname:");
		Scanner s1=new Scanner(System.in);
		firstname=s1.nextLine();
		System.out.println("enter the lasttname:");
		lastname=s1.nextLine();
		System.out.println("enter the departmentname:");
		firstname=s1.nextLine();
		System.out.println("enter the designation:");
		designation=s1.nextLine();
		System.out.println("enter age:");
		age=Integer.parseInt(s1.nextLine());
		System.out.println("enter eid:");
		eid=Integer.parseInt(s1.nextLine());
	}
	public void dis()
	{
		System.out.println("employee details:"+firstname +lastname +departmentname +designation +age +eid);
	}
}