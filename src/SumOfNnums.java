import java.util.Scanner;

public class SumOfNnums
{
	public static void main(String[] args)
	{
		int num,sum=0;
		System.out.print("Enter an integer :");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("The Sum of N numbers :" +sum);	
	}
}
