import java.util.Scanner;

public class FloydTriaangle {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n,num=1,c,d;
		
		n=s.nextInt();
		System.out.println(" FloydTriangle");
		
		for(c=1;c<=n;c++) {
			for(d=1;d<=c;d++) {
				
				System.out.print(num+" ");
				num++;
				
			}
			System.out.println();
			
		}
		

	}

}
