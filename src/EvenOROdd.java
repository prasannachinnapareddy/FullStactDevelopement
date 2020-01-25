import java.util.Scanner;

public class EvenOROdd
{
	public static void main(String[] args)
	{
		int num;
		System.out.print("Enter an integer :");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(num%2==0)
		System.out.println("The num is Even");	
		else
		System.out.println("The num is odd");	
	}
}
