package faltuCode;

class practice {

	public static void main(String[] args) {

		int a = 12345;
		int reverseInt = 0;

		while (a !=0) {
			int lastDigit = a % 10;                   //5                   //4------------------get the last digit
			reverseInt = reverseInt * 10 + lastDigit; //0*10+5=5            //5*10+4=54----------Build the reversed number
			a = a / 10;                               //12345/10=1234.5= 1234//1234/10=123.5=123-Remove the last digit
		}
		System.out.println("Reverse integer value: " + reverseInt);
	}
}