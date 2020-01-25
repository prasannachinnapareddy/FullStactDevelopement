import java.util.Scanner;

public class VowelORConsonant
{
	public static void main(String[] args)
	{
		char character;
		System.out.print("Enter a Character :");
		Scanner sc=new Scanner(System.in);
		character=sc.next().charAt(0); 
		if(character=='a' || character=='e' || character=='i' || character=='o' || character=='u'|| character=='A' || character=='E' || character=='I' || character=='O' || character=='U')
			System.out.println("The Character is Vowel");
		else
			System.out.println("The Character is Vowel");
	}
}
