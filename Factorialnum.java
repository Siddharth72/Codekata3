import java.util.Scanner;

public class Factorialnum {
	
	public static void main(String[] args) {
		
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n number");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			
			fact =fact*i;
		}
		System.out.println("Factorial of th number " +n+" is : " +fact);
		
		sc.close();
	}

}
