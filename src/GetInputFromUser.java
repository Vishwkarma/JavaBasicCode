import java.util.Scanner;

public class GetInputFromUser {

	public static void main(String[] args) {
		
		int a;
		float b;
		String s;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a String");
		s =in.nextLine();
		System.out.println("You enetered string"+ s);
		
		System.out.println("Enter a Integer ");
		a=in.nextInt();
		System.out.println("You entered Inetger"+ a);
		
		System.out.println("Eneter a Float ");
		b=in.nextFloat();
		System.out.println("You entered Inetger"+ b);
		

	}

}
