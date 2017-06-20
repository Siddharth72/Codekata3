import java.util.Scanner;

public class Vowel_Consonant {
	
	
	
	public static void main(String[] args) {
		
	
	Scanner tx = new Scanner(System.in);
	System.out.println("Enter the Character");
	char ch = tx.next().charAt(0);
	
	if(ch =='a' || ch =='A' || ch =='e' || ch =='E' ||ch == 'i' ||ch=='I' ||ch=='o' ||ch =='O')
	{
		System.out.println("Vowel : " +ch);
	}
	else
	{
		System.out.println("Consonant : " +ch);
	}

	tx.close();
}
	
}
