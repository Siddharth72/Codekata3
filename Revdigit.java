import java.util.Scanner;

public class Revdigit {
	
	public static void main(String[] args) {
		Scanner bn = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n = bn.nextInt();
		
		int rem = 0;
		while(n!=0){
			
			rem = rem*10;
			rem = rem +n%10;
			n =n/10;
			
		}
		System.out.println("The reverse number is :" +rem);
		bn.close();
	}

}
