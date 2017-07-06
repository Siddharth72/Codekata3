import java.util.Scanner;

public class Strtoint {
	
	public static void main(String[] args) {
		try{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First_String value : ");   //Enter First_String value as abcd (or) asdq//
		String b = scan.nextLine();		
		System.out.println("Enter the Second_String value : ");   //Enter Seccond_String value as 1234 (or) 3456//
		String a= scan.nextLine();
		
		for(int i=0;i<b.length();i++){
			//The value for the First_String is executed//
			System.out.println("The value for String "+b.charAt(i)+" is : "+(int)b.charAt(i));
			
		}
		int n = Integer.parseInt(a);
		System.out.println("\nThe value for Second_String is : " +n);	
		scan.close();
		
	}catch(Exception e){
		e.printStackTrace();
	}

}
	
}
