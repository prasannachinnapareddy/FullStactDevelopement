package com.cts.main;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Hashmap 
{
	public static void main(String[] args) 
	{
		LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();
		map.put("c",2000);
		map.put("c++",3000);
		map.put("java",4000);
		map.put(null,5000);
		map.replace("c", 1000);
		for(Map.Entry<String,Integer> entry: map.entrySet())
		{
			
		}
		
		
		
	}
}
