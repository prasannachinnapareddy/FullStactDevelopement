package com.cts.main;

public class Stringbuffer
{
	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer("lakshmiprasanna");
		System.out.println(sb.capacity());
		sb.append("thoripakkam");
		System.out.println(sb.capacity());
		sb.append("chennai");
		System.out.println(sb.capacity());
		sb.insert(5,"hello");
		System.out.println(sb);
		sb.delete(1,3);
		System.out.println(sb);
		sb.ensureCapacity(2);
		System.out.println(sb.capacity());	
	}
}
