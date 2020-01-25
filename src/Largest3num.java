import java.util.Scanner;

public class Largest3num 
{
	public static void main(String[] args)
	{
		int num1,num2,num3;
		System.out.print("Enter three numbers :");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		if(num1>num2 && num1>num3)
		System.out.println("The Largest num  is :" +num1);	
		else if(num2>num3 && num2>num3)
		System.out.println("The Largest num is :" +num2);
		else
		System.out.println("The Largest num  is :" +num3);
	}
}
