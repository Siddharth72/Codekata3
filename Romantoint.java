import java.util.Scanner;

public class Romantoint {
	
	public static void main(String[] args) {
		
		int num2 =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the initial number ");
		int num = scan.nextInt();
		System.out.println("Enter the last number ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter the number to find :");
		num2 = scan.nextInt();
		
		
		for(int i =num;i<=num1;i++){
			String unit[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
			String ten[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
			String hundred[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
			String thousand[] = {"","M","MM","MMM","MMMM",};
			
			int unit1 = num2%10;
			int ten1 = (num2/10)%10;
			int hundred1 = (num2/100)%10;
			int thousand1 = num2/1000;
		
			if(num2>0){
				
				System.out.println("The Roman Number of " +num2+ " is : "+thousand[thousand1]+hundred[hundred1]+ten[ten1]+unit[unit1]);
                break;
			}
			
	}
		scan.close();
	}

}
