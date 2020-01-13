package com.cts.main;

import java.util.Scanner;
/*
 3. Write a program in C to copy the elements of one array into another array.
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 15 
element - 1 : 10 
element - 2 : 12 
Expected Output : 
The elements stored in the first array are : 
15 10 12 
The elements copied into the second array are : 
15 10 12 
 */
public class Copy 
{
	public static void main(String[] args)
	{
		int a[],n,i,b[];
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		b=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			System.out.println("elements in array:"+a[i]);
		}
		for(i=0;i<n;i++)
		{
			b[i]=a[i];
			System.out.println("elements in another array:"+b[i]);
		}
     }
}