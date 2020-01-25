import java.util.Scanner;

public class AlphabetORNot 
{
	public static void main(String[] args)
	{
		char character;
		System.out.print("Enter a Character :");
		Scanner sc=new Scanner(System.in);
		character=sc.next().charAt(0); 
		if((character>'a' && character<'z') || (character<'A' && character>'Z'))
		System.out.println("The Given Char is Alphabet");
		else
		System.out.println("The Given Char is Not a Alphabet");
	}
}
