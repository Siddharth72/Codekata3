import java.util.Scanner;

public class Revanum {
	
	public static void main(String[] args) {
		
		int rem,revnum =0,temp =0;
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = Scan.nextInt();
		
		temp = num;
		while(num>0){
			
			rem = num%10;
			revnum = revnum*10+rem;
			num =num/10;
		}
		System.out.println("The Reverse of the given number "+temp+" is : "+revnum);
		Scan.close();
	}

}
