import java.util.Scanner;


public class Largestof3 {
	
	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		System.out.println("Enter three numbers ");
        int a = t.nextInt();
        int b = t.nextInt();
        int c = t.nextInt();
		if(a>b && a>c){
			System.out.println("The greatest number is a = " +a);
		}
		else if(b>c && b>c){
			System.out.println("The greatest number is b = " +b);
		}
		else{
			System.out.println("The greatest number is c = " +c);
		}
		
		t.close();
		
	}

}
