package com.cts.main;

import java.util.Scanner;
/*
 Write a program in C to find the second largest element in an array.
Test Data : 
Input the size of array : 5 
Input 5 elements in the array : 
element - 0 : 2 
element - 1 : 9 
element - 2 : 1 
element - 3 : 4 
element - 4 : 6 
Expected Output : 
The Second largest element in the array is : 6 

 */
public class Secondlar 
{
	public static void main(String[] args)
	{
	 int n,i,a[],sl,l;
	 Scanner s=new Scanner(System.in);
	 n=s.nextInt();
	 a=new int[n];
	 for(i=0;i<n;i++)
	 {
		a[i]=s.nextInt();
		System.out.println("elements in array:"+a[i]);
	 }
	 l=sl=a[0];
	 for(i=0;i<n;i++)
	 {
		 if(a[i]>l)
		 {
			 sl=l;
			 l=a[i];
		 }
		 else if(a[i]>sl && a[i]<l)
			 sl=a[i];
	 }
	 System.out.println("secondlarge num is:"+sl);
    }
}