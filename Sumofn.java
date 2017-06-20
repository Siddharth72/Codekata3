import java.util.Scanner;

public class Sumofn {
	
	public static void main(String[] args) {
		
		Scanner ty = new Scanner(System.in);
		System.out.println("Enter the n element");
		int n = ty.nextInt();
		int sum =0;
		for(int i=0;i<=n;i++){
			sum +=i;
			
		}
		System.out.println("The Sum of n number = " +sum);
	    ty.close();		
	}

}
