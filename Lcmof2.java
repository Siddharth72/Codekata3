import java.util.Scanner;

public class Lcmof2 {

	public static void main(String[] args){
		
		int a,b,temp = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the a value : ");
		a = scan.nextInt();
		System.out.println("Enter the b value : ");
		b = scan.nextInt();
		
		temp=(a>b)?a:b;
		
		if(temp%a==0 && temp%b==0){
			
			System.out.println("The LCM of "+a+" and "+b+" are : " +temp);
		}
		scan.close();
	}
	
}
