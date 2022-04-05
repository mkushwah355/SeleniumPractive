package ExceptionHandling;

import java.util.Scanner;

public class invalidAgeThrowCustom2 {

	public static void main(String[] agr) throws invalidAgeThrowCustom1 {
		try {
			//scanner class used to take the user input
			Scanner s= new Scanner(System.in);
			System.out.println("Entet your age: ");
			int age=s.nextInt();
			//int age = 16;
			if (age < 18) {
				//custom exception declared using throw keyword
				throw new invalidAgeThrowCustom1("Age is below 18 years: You are not eligible for voting");

			} else {
				System.out.println("You are eligible for voting");
			}

		} catch (Exception e) {
			//printstacktrace method used to display the exception
			e.printStackTrace();
		}
		System.out.println("Voting done");
		
	}

}
