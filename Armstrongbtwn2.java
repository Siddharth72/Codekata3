import java.util.Scanner;

public class Armstrongbtwn2 {

	public static void main(String[] args){
		
		int a,b,sum,temp,num,cnt=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the initial number : ");
		a = scan.nextInt();
		
		System.out.println("Enter the last number : ");
	    b = scan.nextInt();
		

		for(int i=a;i<b;i++){
			    temp = i;
                sum = 0;
			   while(temp>0){  
				num = temp%10;
				temp= temp/10;
				sum = sum+(num*num*num);
			
			   }
        
				if(i==sum){
					if(cnt==0){
					System.out.print("Armstrong number : \n");
				}
					System.out.print(i + " ");
					cnt++;
				}
		}
		if(cnt==0){
			System.out.println("No armstrong number found ");
		}
		
		scan.close();
		
	}

	}
	
