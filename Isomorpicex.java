import java.util.HashMap;
import java.util.Scanner;

public class Isomorpicex {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first String : ");
		String a = scan.nextLine();
		System.out.println("Enter the second String : ");
		String b = scan.nextLine();
		
		HashMap<Character,Character> hmap = new HashMap<Character,Character>();
		for(int i=0;i<a.length();i++){
			char a1 = a.charAt(i);
			char b1 = b.charAt(i);
			
			if(hmap.containsKey(a1) && hmap.get(a1)!=b1){
				System.out.println("false");
				return ;
			}
			else{
				hmap.put(a1, b1);
			}
			if(hmap.containsKey(b1) && hmap.get(b1)!=a1){
				System.out.println("false");
				return ;
			}
			else{
				hmap.put(b1, a1);
			}
			
		}
		System.out.println("true");
		return ;
		
	}

	
}
