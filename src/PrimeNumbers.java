import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int n,status =1,num=3;
		
		n=s.nextInt();
		if(n>=1) {
			System.out.print(n);
			System.out.println(2);
			
		}
		
		for(int count =2;count<=n;count++) {
			for(int j=2;j<=Math.sqrt(num);j++) {
				if(num%j ==0) {
					status =0;
					break;
					
				}
			}
			if(status !=0) {
				System.out.println(num);
				count++;
			}
			status =1;
			num++;
		}

	}

}
