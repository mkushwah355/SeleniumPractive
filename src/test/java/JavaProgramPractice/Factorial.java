package JavaProgramPractice;

//Aim: Java program to print factorial of given number.
public class Factorial {

	public static void main(String[] args) {
		
		int n= 5;
		int fact=1;
		
		for(int i=1;i<=n;i++) {
			
			fact=fact*i;
		}
		System.out.println("Factorial of given no: "+fact);		
	}
}
