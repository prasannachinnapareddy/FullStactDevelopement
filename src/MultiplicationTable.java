import java.util.Scanner;

public class MultiplicationTable 
{
	public static void main(String[] args)
	{
		int num;
		System.out.print("Enter an integer :");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int i=1;i<=10;i++)
		System.out.printf("%d * %d = %d \n", num, i, num * i);
	}
}
