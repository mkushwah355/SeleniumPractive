package ExceptionHandling;

import java.util.Scanner;

public class Throw {
	
	void voting(int age) {
		if (age<18) {
			throw new ArithmeticException("Not eligible for voting");
			}
		else {
			System.out.println("Eligible for voting");
		}
	}
	public static void main (String []arg) {
		Throw s= new Throw();
		Scanner input= new Scanner(System.in);
		System.out.println("Enter age:");
		int s1=input.nextInt();
		
		s.voting(s1);

		
	}
	

}
