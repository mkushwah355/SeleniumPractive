package Java_Programs;

//Aim: Reverse integer value WITHOUT converting to String 
class Int_3ReverseIntegers_Palindrom {
	public static void main(String[] args) {

		int a = 12345;
		int a1= a;    //After the while loop, the value of "a" becomes 0, so the comparison if(a==b) will always be false. You should store the original value of a in a separate variable before reversing the number.
		int reverseInt = 0;

		while (a != 0) {                              //a>0 --condition will also work but not for negative no.
			int lastDigit = a % 10;                   //5                   //4------------------get the last digit
			reverseInt = reverseInt * 10 + lastDigit; //0*10+5=5            //5*10+4=54----------Build the reversed number
			a = a / 10;                               //12345/10=1234.5= 1234//1234/10=123.5=123-Remove the last digit
		}
		System.out.println("Reverse integer value: " + reverseInt);
		if (a1==reverseInt) {
			System.out.println("Number is palindrom");
		}else {
			System.out.println("Number is NOT palindrom");
		}
	}
}
//Mayank Approach- Reverse integer value WITHOUT converting to String but storing result into string.
class Int_ReverseIntegerStoringIntoString{
	public static void main (String[]arg) {
		int a= 12345;
		String result="";
		
		while(a>0) {
		result= result+a%10;
		a=a/10;
		}
		System.out.println("ReverseIntegerStoringIntoString: "+result);
	}
}

//Aim: Reverse integer value after converting to String
class Int_ReverseIntegerWITHString {
	public static void main(String[] args) {

		int num = 12345;
		String a = Integer.toString(num);
		String b = "";

		for (int i = a.length() - 1; i >= 0; i--) {
			b = b + a.charAt(i);
		}
		System.out.println(b);

		int result = Integer.parseInt(b);
		System.out.println(result);
	}
}
