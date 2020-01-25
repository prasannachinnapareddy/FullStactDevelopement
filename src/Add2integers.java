import java.util.Scanner;

public class Add2integers 
{
	public static void main(String[] args)
	{
		int num1,num2;
		System.out.print("Enter two numbers :");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("The Sum is :" +(num1+num2));	
	}
}
