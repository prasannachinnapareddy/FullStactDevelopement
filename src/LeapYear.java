import java.util.Scanner;

public class LeapYear
{
	public static void main(String[] args)
	{
		int num;
		System.out.print("Enter an integer :");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if((num%4==0 && num%400==0 && num%100==0) || num%4==0)
		System.out.println("LeapYear");
		else
		System.out.println("Not a leapYear");
	}
}
