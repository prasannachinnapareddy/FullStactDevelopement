package com.cts.main;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class CalculatorTest 
{
	 Calculator c;
	@Before
	public  void init()
	{
		c=new Calculator();
		System.out.println("calculator object created");
	}
	@After
	public  void distroy()
	{
		c=null;
		System.out.println("calculator object removed");
	}
	@Test
	public void addTest() 
	{
		assertEquals(5, c.add(2,3));
	}
	@Test
     public void subTest()
     {
		assertEquals(-1, c.sub(2, 3));
     }
}