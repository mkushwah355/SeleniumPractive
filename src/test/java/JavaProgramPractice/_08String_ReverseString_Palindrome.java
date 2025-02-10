package JavaProgramPractice;
import java.util.Scanner;

/*Palindrome- A palindrome string is a sequence of characters that reads the same backward as forward. 
In other words, if you reverse the string, it remains unchanged. 
Palindromes can be as simple as a single word or as complex as entire sentences.
Single Words:
"madam"
"level"
"radar"
Phrases (ignoring spaces, punctuation, and capitalization):
"A man, a plan, a canal, Panama!"
"Madam, in Eden, I'm Adam."
"Able was I ere I saw Elba."	
*/	
//Aim1: Reverse a string with for loop
class _08String_ReverseString_Palindrome {

	public static void main(String[] args) {

		String s1 = "My name is Mayank";
		String s2 = "";

		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		System.out.println("Original String:" + s1);
		System.out.println("Reverse String:" + s2);
		
//Check whether string is palindrome or not		
		if(s1==s2) {
			System.out.println("String is palindrom");
		}else {
			System.out.println("String is NOT palindrom");
		}
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
