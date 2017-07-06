import java.util.Scanner;

public class Factofanum {
	
	public static void main(String[] args) {
		int fact = 1,temp=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();
		
		temp = num;
		for(int i=1;i<=num;i++){
			
			fact =fact*i;
			
		}
        System.out.println("The factorial of number "+temp+" is : "+fact);
        scan.close();
	}

}
