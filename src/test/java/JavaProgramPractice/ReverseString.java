package JavaProgramPractice;

import java.util.Scanner;

//Aim1: Reverse a string with for loop
class ReverseString {

	public static void main(String[] args) {

		String s1 = "My name is Mayank";
		String s2 = "";
		//System.out.println(str.length());

		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		System.out.println("Original String:" + s1);
		System.out.println("Reverse String:" + s2);
	}
}

//Aim2: Reverse a string with String builder reverse method
class ReverseString1 {

	public static void main(String[] args) {

		String s1 = "My name is Mayank";
		StringBuilder s2 = new StringBuilder();
		s2.append(s1);
		s2.reverse();
		System.out.println("Original String:" + s1);
		System.out.println("Reverse String:" + s2);
	}
}

//Aim3: Reverse a string with for loop while taking the user input
class ReverseString2 {
	public static void main(String[] arg) {

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your input:");
		String s2 = s1.nextLine();
		String s3 = "";
		for (int i = s2.length() - 1; i >= 0; i--) {
			s3 = s3 + s2.charAt(i);
		}
		System.out.println("Entered String:" + s2);
		System.out.println("Reverse string:" + s3);
	}
}
//Aim4: Reverse a string with String builder reverse method while taking the user input

class ReverseStrings3 {
	public static void main(String[] arg) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your input:");
		String s2 = s1.nextLine();

		StringBuilder s3 = new StringBuilder();
		s3.append(s2);
		s3.reverse();
		System.out.println("Entered String:" + s2);
		System.out.println("Reverse String:" + s3);
	}
}
