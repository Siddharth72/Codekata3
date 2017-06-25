import java.util.Scanner;

public class Pallindrome {
	
	public static void main(String[] args) {
		int rem,sum =0,temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = scan.nextInt();
		
		temp = num;
		for(int i =0;i<num;i++){
		    rem =num%10;
		    sum=(sum*10)+rem;
	        num = num/10;
		}
		
		if(temp==sum){
			System.out.println(sum);
			System.out.println("Pallindrome number");
		}
		else
		{
			System.out.println("Not a Pallindrome number");
		}
		
		scan.close();
	}

}
