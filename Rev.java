package com.cts.main;

import java.util.Scanner;
/*
 1. Write a program in C to read n number of values in an array and display it in reverse order
Test Data : 
Input the number of elements to store in the array :3 
Input 3 number of elements in the array : 
element - 0 : 2 
element - 1 : 5 
element - 2 : 7
Expected Output : 
The values store into the array are : 
2 5 7 
The values store into the array in reverse are : 
7 5 2 
 */
public class Rev {
	public static void main(String[] args)
	{
		int size,a[],i;
		Scanner s=new Scanner(System.in);
		size=s.nextInt();
		a=new int[size];
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
			System.out.println("order is:"+a[i]);
		}
		for(i=size-1;i>=0;i--) 
		{
			System.out.println("reverse order is:"+a[i]);
		}

    }
}