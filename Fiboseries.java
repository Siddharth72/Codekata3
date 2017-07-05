import java.util.Scanner;

public class Fiboseries {
	
	public static void main(String[] args) {
		int temp = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range : ");
		int n = scan.nextInt();
		
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1+" "+num2);
		for(int i =2;i<=n;i++){
			
			temp = num1+num2;
			System.out.print(" "+temp);
			num1 = num2;
			num2 = temp;
			
		}
		
	}

}
