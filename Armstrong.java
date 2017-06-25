import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		int temp,num =0,num1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scan.nextInt();
		
		temp = n;
		while(n>0){
			num1 = n%10;
			n = n/10;
			num = num+(num1*num1*num1);
		}
		if(num==temp){
			System.out.println("Armstrong number ");
		}
		else{
			System.out.println("Not an Armstrong number ");
		}
		scan.close();
	}

}
