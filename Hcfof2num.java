import java.util.Scanner;

public class Hcfof2num {
	public static void main(String[] args) {
		
		int n,temp = 0,temp2 =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n1 = scan.nextInt();
		System.out.println("Enter the second number : ");
		int n2 = scan.nextInt();
		
		temp = n1;
		temp2 = n2;
		while(n2!=0){
			n = n1%n2;
			n1 = n2;
			n2 = n;
		}
		System.out.println("HCF of 2 numbers : " +temp+ " and "+temp2+" is " +n1);
		scan.close();

	}

}
