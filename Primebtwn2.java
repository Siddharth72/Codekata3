import java.util.Scanner;

public class Primebtwn2 {
	
	public static void main(String[] args) {
		
		int temp=0,temp2=0,d=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the initial number");
		int num1 = scan.nextInt();
		System.out.println("Enter the last number");
		int num2 = scan.nextInt();
		
		temp = num1;
		temp2 = num2;
		System.out.println("The Prime number range between the numbers "+temp+" and "+temp2+" are : " );
		
		for(int i=num1;i<=num2;i++){
			
			for(int j=2;j<i;j++){
				
				if(i%j==0){
					d=0;
					break;
				}
				else
				{
					d=1;
				}
			}
			if(d==1){
				System.out.print(i+ " ");
			}
			scan.close();
		}
	}

}
