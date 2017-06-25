import java.util.Scanner;

public class Prime {
	
	public static void main(String[] args) {
		
		int temp = 0,n=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();
		
		n = num/2;
		for(int i=2;i<=n;i++){
			if(num%i==0){
				System.out.println("Number is not a prime");
				temp =1;
				break;
			}
			
		}
		if(temp==0){
			System.out.println("Prime number");
		}
		scan.close();
	}

}
