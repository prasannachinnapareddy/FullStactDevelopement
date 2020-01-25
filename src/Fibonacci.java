import java.util.Scanner;

public class Fibonacci 
{
	public static void main(String[] args)
	{
	int num1=0,num2=1,range;
	System.out.print("Enter a value: ");
	Scanner sc=new Scanner(System.in);
	range=sc.nextInt();
	System.out.print(+num1);
	System.out.print(+num2);
	for(int i=2;i<range;i++)
	{
	  int num3=num1+num2;
	  System.out.print(num3);
	  num1=num2;
	  num2=num3;
	}
}
}
