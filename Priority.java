package com.cts.main;
import java.util.*;
public class Priority
{
	public static void main(String[] args)
	{
		PriorityQueue<String> pq = new PriorityQueue<String>(); 
		pq.add("prasanna");
		pq.add("svvl");
		pq.add("bsnl");
		System.out.println(pq.peek());
		 System.out.println("The queue elements:"); 
	        Iterator itr = pq.iterator(); 
	        while (itr.hasNext()) 
	            System.out.println(itr.next()); 
		//System.out.println(pq.poll());	
	}
}
