import java.util.Scanner;

public class NODinNUM 
{
	public static void main(String[] args)
	{
		int num,count=0;
		System.out.print("Enter an integer :");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while(num!=0)
		{
			int rem=num%10;
			count=count+1;
			num=num/10;
		}
		System.out.println("Total No of Digits in a Number :" +count);	
	}
}
