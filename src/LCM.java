import java.util.Scanner;

public class LCM
{
	public static void main(String[] args)
	{
		int num1,num2,gcd=0;
		System.out.print("Enter two numbers :");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		for(int i=1;i<=num1 && i<=num2;i++)
		{
			if(num1%i==0 && num2%i==0)
			gcd=i;	
		}
		int lcm=(num1*num2)/gcd;
		System.out.println("The LCM of Two numbers: " +lcm);	
	}
}
