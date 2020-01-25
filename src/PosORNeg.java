import java.util.Scanner;

public class PosORNeg
{
	public static void main(String[] args)
	{
		int num;
		System.out.print("Enter an integer :");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(num>0)
		System.out.println("The num is Positive");	
		else
		System.out.println("The num is Negative");	
	}
}
