import java.util.Scanner;

public class POWofNum 
{
	public static void main(String[] args)
	{
	int num,pow,result=1;
	System.out.print("Enter number and power :");
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	pow=sc.nextInt();
	for(int i=1;i<=pow;i++)
	{
		result=result*num;
	}
	System.out.println("The Power of a Number :" +result);
   }
}
