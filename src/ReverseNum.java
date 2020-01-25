import java.util.Scanner;

public class ReverseNum 
{
	public static void main(String[] args)
	{
		int num,rev=0;
		System.out.print("Enter an integer :");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while(num!=0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse of a Number :" +rev);	
	}
}
