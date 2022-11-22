import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {
		
		var s= new Scanner(System.in);
		String s1 ,s2;
		
		s1=s.nextLine();
		s2=s.nextLine();
		
		if(s1.compareTo(s2)>0) 
			System.out.println("First String is greater than second ");
			
		
		else if(s1.compareTo(s2)<0) 
			System.out.println("second String is greater than first ");
			
		else {
			System.out.println("Both String are Equal");
		}
		}

}
