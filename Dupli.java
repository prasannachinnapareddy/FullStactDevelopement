package com.cts.main;

import java.util.Scanner;
/*
 4. Write a program in C to count a total number of duplicate elements in an array.
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 5 
element - 1 : 1 
element -
Expected Output : 
Total number of duplicate elements found in the array is : 1 

 */
public class Dupli 
{
	public static void main(String[] args)
	{
	 int n,i,j,a[],c=1;
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
			 if(a[i]==a[j])
				 c++;
			 else 
				 break;
		 }
	 }
		 System.out.println("total no of duplicates:"+c);
	 }
}