import java.util.Scanner;

public class Power {
	
	public static void main(String[] args) {
		
		Scanner sx = new Scanner(System.in);
		System.out.println("Enter the base number ");
		int base = sx.nextInt();
		System.out.println("Enter the exponent number ");
		int exp = sx.nextInt();
		int sum=1;
		for(int i=0;i<exp;i++){
			sum = base*sum; 
		}
		System.out.println("the power is = " +sum);
		sx.close();
	}

}
