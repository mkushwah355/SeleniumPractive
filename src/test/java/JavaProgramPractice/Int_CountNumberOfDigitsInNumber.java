package JavaProgramPractice;

import java.util.Arrays;

//Count number of digits in number
class Int_CountNumberOfDigitsInNumber {

	public static void main(String[] arg) {

		int a = 19874628; //output=8
		int count = 0;

		while (a > 0) {

			a = a / 10;
			count++;
		}
		System.out.println("Number of integer count is: "+count);

	}
}
