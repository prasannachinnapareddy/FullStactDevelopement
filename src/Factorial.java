import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args)
	{
		int num,fact=1;
		System.out.print("Enter an integer :");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("The Factorial of a number is :" +fact);	
		}
}
