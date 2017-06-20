import java.util.Scanner;

/*Check whether a character is alphabet or not*/
public class Alphabet {

	public static void main(String[] args) {
		
		Scanner ts = new Scanner(System.in);
		System.out.println("Enter the character ");
		char st = ts.next().charAt(0);
		
		if(st>='a' && st<='z' || st>='A' && st<='Z'){
			System.out.println("The character is Alphabet = " +st);
		}
		else
		{
			System.out.println("The Character is non Alphabet = " +st);
		}
		
		ts.close();
		
	}
