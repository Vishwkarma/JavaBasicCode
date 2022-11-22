import java.util.Scanner;
import java.math.BigInteger;

public class AddNumbers {
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
//		int x=s.nextInt();
//		int y=s.nextInt();
//		
//		int z=x+y;
//		
//		System.out.print(z);
		
		String n1=s.nextLine();
		String  n2 =s.nextLine();
		
	  BigInteger first= new BigInteger(n1);
	  BigInteger second= new BigInteger(n1);
	  
	  BigInteger sum;
	  
	  sum=first.add(second);
	  System.out.println("Result of addition = "+ sum);
	  
	}

	  
		
		
}
