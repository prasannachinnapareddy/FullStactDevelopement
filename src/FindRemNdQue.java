import java.util.Scanner;

public class FindRemNdQue 
{
	public static void main(String[] args)
	{
		int num;
		System.out.print("Enter an integer :");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		System.out.println("The Remainder value is :" +(num%10));	
		System.out.println("The Quotient value is :" +(num/10));	
		}
}
