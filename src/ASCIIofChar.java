import java.util.Scanner;

public class ASCIIofChar 
{
	public static void main(String[] args)
	{
		char character;
		System.out.print("Enter a Character :");
		Scanner sc=new Scanner(System.in);
		character=sc.next().charAt(0); 
		int val=character;
		System.out.println("The ASCII Value of cCharacter is :" +val);
		}
}
