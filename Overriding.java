package com.cts.main;

public class Overriding 
{
 public static void main(String[] args)
 {
	 Emp1 e=new Emp2();
	 e.display();
	// Emp2 t=new Emp2();
	 //t.display();
 }
}
class Emp1
{
	void display()
	{
		System.out.println("Employee class one");
	}
}
class Emp2 extends Emp1
{
	void display()
	{
		System.out.println("Employee class two");
	}
}
