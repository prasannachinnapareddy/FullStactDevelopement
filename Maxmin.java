package com.cts.main;

import java.util.Scanner;
/*Write a program in C to find the maximum and minimum element in an array. 
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 45 
element - 1 : 25 
element - 2 : 21 
Expected Output : 
Maximum element is : 45 
Minimum element is : 21 */

public class Maxmin {
	public static void main(String[] args)
	{
	 int n,i,l,a[],m;
	 Scanner s=new Scanner(System.in);
	 n=s.nextInt();
	 a=new int[n];
	 for(i=0;i<n;i++)
	 {
		a[i]=s.nextInt();
		System.out.println("elements in array:"+a[i]);
	 }
	 l=a[0];
	 for(i=0;i<n;i++)
	 {
		 if(a[i]>l)
			 l=a[i];
	 }
	 System.out.println("max is:"+l);
	 m=a[0];
	 for(i=0;i<n;i++)
	 {
		 if(a[i]<m)
			 m=a[i];
	 }
	 System.out.println("min is:"+m);
	}
}