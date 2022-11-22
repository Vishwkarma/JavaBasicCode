import java.util.Scanner;

public class SubStringsOfAString {
	
	Scanner s = new Scanner(System.in);{
	String string ,sub;
	
	int i,c,length;
	
	string =s.nextLine();
	length=string.length();
	
	System.out.println("SubString of \""+string+"\"+ are:-" );
	
	for(c=0;c<length;c++) {
		for(i=1;i<=length -c;i++) {
			
			sub=string.substring(c,c+i);
			System.out.println(sub);
		}
	}
	
	

}
	
}
