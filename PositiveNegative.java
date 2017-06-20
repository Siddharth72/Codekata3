import java.util.Scanner;

public class PositiveNegative {
	
	/*Check whether the number is positive or negative or zero*/
	
	public static void main(String[] args) {
		
		   Scanner sc=new Scanner(System.in);  
		  
		   System.out.println("Enter a number");
		   int number = sc.nextInt();
	        
		   if(number<0)
		   {
			   System.out.println("The number is negative = " +number);
		   }
		   else if(number>0){
			   System.out.println("The number is positive = " +number);
			   
		   }
		   else
		   {
			   System.out.println("The number is Zero");
		   }
		   
		 
		   sc.close();
	}
	
	

}
