import java.util.Scanner;

public class NestedIFElse {

	public static void main(String[] args) {
	 int marksObtained , pasingMarks;
	 
	 char grade;
	 
	 int passingMarks =40;
	 
	 Scanner s= new Scanner(System.in);
	 marksObtained = s.nextInt();
	 
	 if(marksObtained >= passingMarks) {
		 
		 if(marksObtained >90) 
			 grade = 'A';
			 
		 else if(marksObtained >75) 
			 grade='B';
		 
		 else if(marksObtained >60)
			 grade = 'C';
		 else 
			 grade ='D';
		 
		 System.out.println("Pass" +grade);
		 
			 
			 
		 }else {
			 
			 grade='F';
			 System.out.println("Fail"+grade );
		 }
	 
	 
	}
}
