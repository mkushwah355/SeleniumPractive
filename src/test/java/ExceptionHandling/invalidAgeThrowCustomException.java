package ExceptionHandling;

import java.io.IOException;
import java.util.Scanner;

class invalidAgeException extends Exception {
	// invalidAgeThrowCustom1 is constructor created to ini the
	// invalidAgeThrowCustom1 class
	invalidAgeException(String msg) {
		// super keyword used to call the parent class method and variables
		super(msg);
	}
}

 class invalidAgeThrowCustomException {

	public static void main(String[] agr) throws invalidAgeException {
		try {
			// scanner class used to take the user input
			// System.in --it is used to read characters from the keyboard or
			// any other standard input device.
			Scanner s = new Scanner(System.in);
			System.out.println("Enter your age: ");
			int age = s.nextInt();
			// int age = 16;
			if (age < 18) {
				// custom exception declared using throw keyword
				throw new invalidAgeException("Age is below 18 years: You are not eligible for voting");

			} else {
				System.out.println("You are eligible for voting");
			}

		} catch (Exception e) {
			// printstacktrace method used to display the exception
			e.printStackTrace();
		}
		System.out.println("Voting done");

	}

}
