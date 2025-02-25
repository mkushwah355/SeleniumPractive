package Java_Programs;

//Aim: Count number of digits in number without converting into string.
class Int_1CountNumberOfDigitsInNumber {

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
//Aim: Count number of digits in number after converting into string.

class Int_CountNumberOfDigitsInNumberConvertingIntoString {

	public static void main(String[] arg) {

		long a = 19874628123L; // int can hold only until 2147483647 after this long should be used with L.
		
		String str=Long.toString(a);
		//String str=""+a;   //it will also convert int into string
		System.out.println(str.length());

	}
}