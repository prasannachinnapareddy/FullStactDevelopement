 package com.cts.main;

import java.util.Scanner;
/*
  Write a program in C to separate odd and even integers in separate arrays.
Test Data : 
Input the number of elements to be stored in the array :5 
Input 5 elements in the array : 
element - 0 : 25 
element - 1 : 47 
element - 2 : 42 
element - 3 : 56 
element - 4 : 32 
Expected Output : 
The Even elements are : 
42 56 32 
The Odd elements are : 
25 47

 */
public class Evenodd 
{
	public static void main(String[] args)
	{
	 int n,i,l,a[],m,b[],c[],j=0,k=0,n1=0,n2=0;
	 Scanner s=new Scanner(System.in);
	 n=s.nextInt();
	 a=new int[n];
	 b=new int[n];
	 c=new int[n];
	 for(i=0;i<n;i++)
	 {
		a[i]=s.nextInt();
		System.out.println("elements in array:"+a[i]);
	 }
	 for(i=0;i<n;i++)
	 {
		 if(a[i]%2==0)
		 {
			 n1++;
			 b[j]=a[i];
			 j++;
		 }
		 else
		 {
			n2++;
			 c[k]=a[i];
			 k++;
		 }
	 }
	 System.out.println("even numbers:");
	 for(j=0;j<n1;j++)
		 System.out.println(b[j]);
	 System.out.println("odd numbers:");
	 for(k=0;k<n2;k++)
		 System.out.println(c[k]);
	}
}