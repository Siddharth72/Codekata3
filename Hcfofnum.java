import java.util.Scanner;

public class Hcfofnum {
	
	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number");
		int num2 = scan.nextInt();
		
		while(num2>0){
			num = num1%num2;
			num1 = num2;
			num2 = num;
		}
		System.out.println("The HCF or GCD : " +num1);
    scan.close();
	}

}
