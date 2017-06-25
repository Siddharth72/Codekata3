import java.util.Scanner;

public class Oddnum{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    
		System.out.println("Enter the element : ");
		int a = scan.nextInt();
		
		System.out.println("Enter the element till range : ");
		int num = scan.nextInt();
		
		for(int i=a;i<=num;i++){
			
			if(i%2==1){
				System.out.println(i);
			}
			
		}
		
	}
}
