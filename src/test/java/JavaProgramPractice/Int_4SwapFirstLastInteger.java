package JavaProgramPractice;

//Aim: Reverse 1st & last digit of a number WITHOUT converting to string (input:12345 output:52341 )
 class Int_4SwapFirstLastInteger {
	public static void main(String[] args) {		
		int num= 12345;
		
		int lastDigit;
		int firstDigit=num;
		int power;
		
		lastDigit = num % 10;
		System.out.println("Last digit of series: "+lastDigit);

//the number of digits in 12345 is 5. The base-10 logarithm of 12345 is approximately 4.091514977167074. 
//If you take the integer part of this result (which is 4) and add 1, you get the number of digits:	4 + 1 = 5

		power=(int)Math.log10(num);          //TypeCasting=(int)--it converts the result of Math.log10(a) from a double to an integer by discarding the decimal part.
		System.out.println("power: "+power);//num = 12345, power will be 4
	
		firstDigit = (int) (num / Math.pow(10, power));	//12345/10000=1.2345=1
		System.out.println("First digit of series: "+firstDigit);
		
		int a = firstDigit * (int) Math.pow(10, power);//a=1*10000=10000
		
//remove first digit		
		int b= num % a; //12345%10000= 1.2345= 2345(remainder)
		System.out.println("removed first digit: "+b);
		
//remove last digit		
		int c =b/10; //2345/10= 234.5= 234
		System.out.println("removed last digit: "+c);
		
//add all numbers		
		int d = (lastDigit * (int)Math.pow(10, power)) + c * 10 + firstDigit; //50000+2340+1= 52341
		System.out.println("result: "+d);
		
		/*		5*10*3=50000
				234*10= 2340
					1 =    1
				------------
				      =52341
				*/		
	}}
 
//--------------------------------------------------------------------------------------------------------------
//Aim: Reverse 1st & last digit of a number after converting to String (input:12345 output:52341)
class Int_SwapFirstLastIntegerUsingString {

 	public static void main(String[] args) {
		int num = 12345;
 		
 //Convert the number to a string
 		String a=Integer.toString(num);
 		System.out.println(num);
 		
 //Extract the first, last & mid characters		
 		char firstDigit=a.charAt(0); 
 		System.out.println("First digit: "+firstDigit);//1
 		
 		char lastDigit=a.charAt(a.length()-1);
 		System.out.println("Last digit: "+lastDigit);//5
 		
 		String mid= a.substring(1, a.length() - 1);
 		System.out.println("Mid characters: "+mid);//234
 		
 //Create the new string with the first and last characters swapped		
 //substring(int beginIndex, int endIndex): This method returns a new string that is a substring of the original string. 
 //The substring begins at the specified beginIndex and extends to the character at index endIndex - 1	
 		
	String newString = lastDigit + mid + firstDigit;
 	System.out.println("New string after swapping: "+newString);
 		
 //Convert the new string back to an integer		
 		int result=Integer.parseInt(newString);
 		System.out.println("Result: "+result);
 	}}

/*Note: explanation of int to String conversion
Integer.toString(num): 
Integer: This is a wrapper class for the primitive data type int in Java.
toString(num): This is a static method in the Integer class. It takes an integer argument and converts it to a string.

*/