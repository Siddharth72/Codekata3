import java.util.Scanner;

public class Multiptable {
	
	public static void main(String[] args) {
		int temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		System.out.println("Enter the range of multiplication");
		int num =scan.nextInt();
		
		for(int i=1;i<=num;i++){
			temp = n*i;
			System.out.println(+n+ " * " +i+" = " +temp);
		}
		
	}
	

}
