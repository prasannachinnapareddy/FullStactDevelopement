package com.cts.main;

import java.util.Scanner;
/*
 2. Write a program in C to find the sum of all elements of the array.
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 2 
element - 1 : 5 
element - 2 : 8 
Expected Output : 
Sum of all elements stored in the array is : 15 

 */
public class Sum {
	public static void main(String[] args)
	{
		int i,n,a[],sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			System.out.println("elements in array:"+a[i]);
		}
		for(i=0;i<n;i++)
			sum=sum+a[i];
			System.out.println(sum);
		
	}

}