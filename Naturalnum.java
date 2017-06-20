import java.util.Scanner;

public class Naturalnum {
	
	public static void main(String[] args) {
		
		Scanner tr = new Scanner(System.in);
		System.out.println("Enter the n element");
		int n = tr.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++){
			sum += i;
			}
		System.out.println("The value for the natural numbers = " +sum);
		
		tr.close();
	}

}
