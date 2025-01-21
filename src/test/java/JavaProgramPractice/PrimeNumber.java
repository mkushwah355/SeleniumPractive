package JavaProgramPractice;

//Aim: Check whether given number is prime or not
public class PrimeNumber {

	public static void main(String[] arg) {
		
		int a= 11;
		boolean flag=false;
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
				flag=true;
				break;
			}			
		}
		if(flag)
			System.out.println("Not a prime number");
		else
			System.out.println("It is prime number");		
	}
}
