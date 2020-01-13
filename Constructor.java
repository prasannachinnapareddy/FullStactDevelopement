package com.cts.main;
public class Constructor
{
	public static void main(String[] args)
	{
		A a=new A();
		A b=new A(10);
		B c=new B();
	}
}
class A
{
	A()
	{
		super();
		System.out.println("1");
	}
	A(int a)
	{
		this();
		System.out.println("2");
	}
	{
		System.out.println("3");
	}
}
class B extends A
{
	B()
	{
		super(10);
		System.out.println("4");
	}
	{
		System.out.println("5");
	}
}