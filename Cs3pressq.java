import java.util.Scanner;

public class Cs3pressq {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of char : ");
		int n = scan.nextInt();
		
		char[] ch = new char[n];
		System.out.println("Enter the char : ");

		for(int i=0;i<ch.length;i++){
			
			ch[i] = scan.next().charAt(0);
			
			if(ch[i]=='Q' || ch[i]=='q'){
				System.out.println("<<<<<<<<<!!!!!The Program Exit!!!!!>>>>>>>>>");			
				break;
			}
		}
		scan.close();			
	}

}
