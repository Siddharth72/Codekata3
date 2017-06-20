import java.util.Scanner;

public class Leapyear {
	public static void main(String[] args) {
	
		Scanner tl = new Scanner(System.in);
		
		System.out.println("Enter the Year ");
		int year = tl.nextInt();
		
		if(year%4==0 || year%100==0 || year%400==0){
			System.out.println("The year is a leap year = " +year);
		}
		else{
			System.out.println("Not a leap year = " +year);
		}
        tl.close();
	}
	
}
