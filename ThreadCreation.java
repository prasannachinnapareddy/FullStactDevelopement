package com.cts.activity.main;

public class ThreadCreation 
{  
	public static void main(String[] args) 
	{
		Resource resource=new Resource();
		FirstThread ft=new FirstThread(resource);
		SecondThread st=new SecondThread(resource);
		Thread threadone=new Thread(ft);
		Thread threadtwo=new Thread(st);
		threadone.start();
		threadtwo.start();
	}
}
class FirstThread implements Runnable
{
	Resource resource;
	public FirstThread(Resource resource)
	{
		this.resource=resource;
	}
	public void run()
	{
		resource.display("firast thread:");
	}
}
class SecondThread implements Runnable
{
	Resource resource;
	public SecondThread(Resource resource)
	{
		this.resource=resource;
	}
	public void run()
	{
		resource.display("Second thread:");
	}
}
class Resource
{
	public void display(String message)
	{
		for(int i=1;i<=5;i++)
			System.out.println(message+" "+i);
	}
}