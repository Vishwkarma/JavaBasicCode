//How to create method overriding 
public class Bank {
	
int getRateOfInterest() {
	return 0;
	
}
}
class SBI extends Bank{
	int getRateOfInterest()
	{
		return 8;
	}
}
	class ICICI extends Bank{
		int getRateOfInterest()
		{
			return 7;
		}
	}
		class AXIS extends Bank{
			int getRateOfInterest()
			{
				return 9;
			}
		}
			class Test2{
				public static void main(String[] args) {
					
					
					SBI s = new SBI();
					ICICI i =new ICICI();
					AXIS a= new AXIS();
					
					System.out.println("SBI Rate of Interest : " + i. getRateOfInterest());
					System.out.println("ICICI Rate of Interst : "+ s. getRateOfInterest());
					System.out.println("AXIS Rate of Interst : "+ a. getRateOfInterest());
					
					
				}
			}
