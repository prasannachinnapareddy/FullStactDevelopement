import java.util.Scanner;

public class Swap2Num
{
	public static void main(String[] args)
	{
		int num1,num2;
		System.out.print("Enter two numbers :");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		int swap;
		swap=num1;
		num1=num2;
		num2=swap;
		System.out.println("After Swapping The Numbers will be :\n" +num1+"\n"+num2);
	}
}
