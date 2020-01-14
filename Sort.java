package com.cts.main;

import java.util.Scanner;
/*
  Write a program in C to sort elements of array in ascending order.
Test Data : 
Input the size of array : 5 
Input 5 elements in the array : 
element - 0 : 2 
element - 1 : 7 
element - 2 : 4 
element - 3 : 5 
element - 4 : 9 
Expected Output : 
Elements of array in sorted ascending order: 
2 4 5 7 9
 */
public class Sort
{
	public static void main(String[] args)
	{
	 int n,i,a[],j,t=0;
	 Scanner s=new Scanner(System.in);
	 n=s.nextInt();
	 a=new int[n];
	 for(i=0;i<n;i++)
	 {
		a[i]=s.nextInt();
		System.out.println("elements in array:"+a[i]);
	 }
	 for(i=0;i<n;i++)
	 {
		 for(j=i+1;j<n;j++)
		 {
			 if(a[i]>a[j])
			 {
				 t=a[i];
				 a[i]=a[j];
				 a[j]=t;
			 }
		 }
	 }
	 System.out.println("sorted array is:");
	 for(i=0;i<n;i++)
		 System.out.println(a[i]);
	}
}