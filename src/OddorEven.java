import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	
		int x=s.nextInt();
		
		if(x%2==0) {
			
			System.out.print("Even :" + x);
			
		}
		else {
			System.out.print("odd :"+ x);
		}

	}

}
