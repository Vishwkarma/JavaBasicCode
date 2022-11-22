import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		int n,c ,fact=1;
		
		System.out.println("Enter te number which calculate factorial ");
	
		
		n=s.nextInt();
		
		if(n<0) {
			System.out.println("No. should be non-negative Number");
			
		}
		else {
			
			for(c=1;c<=n;c++) {
				fact =fact*c;
				
				System.out.println("Factorial of n is "+ n + "is" + fact);
			}
		}
	
	}

}
