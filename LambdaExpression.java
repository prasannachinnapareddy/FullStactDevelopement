package com.cts.activity.main;

public class LambdaExpression 
{
	public static void main(String[] args)
	{
		Runnable r=() -> {for(int i=1;i<=10;i++)
			System.out.println("Main thread is:"+i);
		};
		Thread t=new Thread(r);
		t.start();
		for(int i=1;i<=10;i++)
			System.out.println("child hread is:"+i);
		//Hello h=(a,b) -> a+b;
		//System.out.println(h.add(10, 20));
	}
}
interface Hello
{
	//public void dispaly();
	public int add(int a,int b);
}
/*interface Interf {
 public void sum(int a,int b);
	}
	 class Demo implements Interf {
	 public void sum(int a,int b) {
	 System.out.println((a+b));
	 }
	 }
	 public class LambdaExpression {
	 public static void main(String[] args) {
	 Interf i = new Demo();
	 i.sum(20,5);
	 }
	 }
*/