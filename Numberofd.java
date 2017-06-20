import java.util.Scanner;

public class Numberofd {

	public static void main(String[] args) {
		
		Scanner sd = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int n = sd.nextInt();
		int count = 0;
		while(n!=0){
			n = n/10;
			++count;
		}
		System.out.println("The number of digit = " +count);
		sd.close();
	}
}
