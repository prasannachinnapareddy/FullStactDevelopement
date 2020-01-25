import java.util.Scanner;

public class StringNdInp 
{
	public static void main(String[] args)
	{
		int year;
		String name;
		System.out.println("Enter name and year:");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		year=sc.nextInt();
		System.out.println("My Name is" +name+"I'll graduate in"+year);
		
	}
}
