package faltuCode;
//Reverse 1st & last digit of a number (input:12345 output:52341 without converting the string)
public class practice2 {

	public static void main(String[] args) {
		
		int num= 12345;
		
		int lastDigit;
		int firstDigit=num;
		int power;
		
		lastDigit=num%10;
		System.out.println("Last digit of series: "+lastDigit);

//the number of digits in 12345 is 5. The base-10 logarithm of 12345 is approximately 4.091514977167074. 
//If you take the integer part of this result (which is 4) and add 1, you get the number of digits:	4 + 1 = 5

		power=(int)Math.log10(num); //TypeCasting=(int)--it converts the result of Math.log10(a) from a double to an integer by discarding the decimal part.
		System.out.println("power: "+power);//num = 12345, power will be 4
	
		firstDigit= (int)(num/Math.pow(10, power));		
		System.out.println("First digit of series: "+firstDigit);
		
		int a=firstDigit*(int)Math.pow(10,power);
		//System.out.println(a);
//remove first digit		
		int b= num%a;
		System.out.println("removed first digit: "+b);
//remove last digit		
		num=b/10;
		System.out.println("removed last digit: "+num);
//adding all numbers		
		num=(lastDigit*(int)Math.pow(10, power))+num*10+firstDigit;
		System.out.println("result: "+num);
		
		/*		5*10*3=50000
				234*10= 2340
					1 =    1
				------------
				      =52341
				*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}}
