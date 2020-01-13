package com.cts.activity.main;
public class ThreadDemo
{
	public static void main(String[] args)
	{
		Thread thread=Thread.currentThread();
		System.out.println(thread);
		System.out.println("Thread name is:"+thread.getName());
		thread.setName("CTS Thread");
		System.out.println("Thread name is:"+thread.getName());
		System.out.println("Is Thread Daemon:"+thread.isDaemon());
		System.out.println("Is Thread Aalive:"+thread.isAlive());
		System.out.println("Thread State:"+thread.getState());
		System.out.println("Thread Id:"+thread.getId());
	}
}

