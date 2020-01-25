import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args)
	{
		int num,rev=0;
		System.out.print("Enter an integer :");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int temp=num;
		while(temp!=0)
		{
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(rev==num)
		System.out.println("Palindrome");
		else
		System.out.println("NotPalindrome");
	}
}
