package com.cts.main;
import java.util.*;
public class Sms{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	if(str.contains("yes")||str.contains("today")||str.contains("why")||str.contains("you"))
	{
		str=str.replace("yes","s");
	    str=str.replaceAll("today","2day");
		str=str.replaceAll("why","y");
		str=str.replaceAll("you","u");
	}
	System.out.println(str);
}
}
