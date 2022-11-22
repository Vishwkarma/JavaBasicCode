import java.util.Scanner;

public class LargestThreeNumber {

	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		
		int x=s.nextInt();
		int y=s.nextInt();
		int z=s.nextInt();
		
		if(x>y && x>z)
			System.out.println(x);
		else if(y>x && y>z) 
			System.out.println(y);
			else if(z>x&& z>y) {
				
				System.out.println(z);
				
			}
		
		
		
	}

}
