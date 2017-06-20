import java.util.Scanner;

public class Stringrev {
	
	public static void main(String[] args) {
		String rev = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String variable");
		String  tm = sc.nextLine();
		int length = tm.length();
		
		for(int i= length-1 ;i>=0;i--){
			rev = rev + tm.charAt(i);
			
			}
		
		System.out.println("The rev string is = " +rev);
		sc.close();
	}

}
