package com.cts.main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class ArrayListDemo 
{
	public static void main(String[] args)
	{
		ArrayList<Employeedemo> list=new ArrayList<Employeedemo>();
		Employeedemo emp1=new Employeedemo(25, "prasanna", "guntur", 21, 9701530108L, 250000.00);
		Employeedemo emp2=new Employeedemo(24, "vaishu", "hyd", 20, 9876543210L, 240000.00);
		Employeedemo emp3=new Employeedemo(26, "sai", "chennai", 22, 1234567890L, 230000.00);
		Employeedemo emp4=new Employeedemo(27, "suji", "nrt", 23, 9767858591L, 220000.00);
		Employeedemo emp5=new Employeedemo(28, "sravs", "sap", 24, 6303168932L, 210000.00);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		//System.out.println(list.toString());
		//for(Employeedemo employee:list)
		//{
			//System.out.println(employee);
		//}
		ArrayList<Integer> list1=new ArrayList<Integer>(Arrays.asList(4,6,7,3,1));
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
	}
}
