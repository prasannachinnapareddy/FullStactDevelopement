import java.util.Scanner;
public class RootsOfEq 
{
	public static void main(String[] args)
	{
		int a,b,c;
		double r1,r2;
		System.out.print("Enter three numbers :");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int d=((b*b)-(4*a*c));
		r1=(-b+Math.sqrt(d))/(2*a);
		r2=(-b-Math.sqrt(d))/(2*a);
		System.out.println("The roots of given equation :" +r1);
		System.out.println("The roots of given equation :" +r2);
	}
}
