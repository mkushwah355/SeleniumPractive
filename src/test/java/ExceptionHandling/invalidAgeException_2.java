package ExceptionHandling;

import java.util.Scanner;

class invalidAgeException1_2 extends Exception{

	
	invalidAgeException1_2(String s){
		super(s);
}}

class invalidAgeException_2 {
	
	public static void main (String []arg) throws invalidAgeException1_2 {
		//int age=21;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		
		if(age<18) {
			throw new invalidAgeException1_2("not eligible");
		}
		else {
			System.out.println("eligible");
		}
	}
}