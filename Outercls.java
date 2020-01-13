package com.cts.main;
class Outer
{
	int x=10;
	static int y=20;
	/*class Inner
	{
	 public void display()
	 {
		System.out.println(x);
		System.out.println(y);	 
	 }*/
	public void display()
	 {
		class Mem
		{
			public void show()
			{
		      System.out.println(x);
		      System.out.println(y);	 
	        }
		}
		Mem m=new Mem();
		m.show();
	
      }
}
class Outercls
{
	public static void main(String[] args)
	{
		/*Outer outer=new Outer();
		Outer.Inner inner=outer.new Inner();
		inner.display();*/
		//Outer.Inner.dispaly();
		Outer o=new Outer();
		o.display();
	}
}