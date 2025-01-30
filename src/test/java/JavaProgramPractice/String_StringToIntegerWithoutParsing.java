package JavaProgramPractice;

//Java program to convert string to integer without using inbuild(integer.parse)
public class String_StringToIntegerWithoutParsing {

	public static void main(String[] args) {
		String str = "123";

		int num = 0;

		for (int i = 0; i < str.length(); i++) {

			num = num * 10 + ((int) str.charAt(i) - 48); //0*10+(49-48)=1, 1*10+(50-48)=12, 12*10(51-48)=123
		}

		System.out.println("String to int: "+num + 10); // Output should be 133
	}
}


/*Note: 1. The number is formed by repeatedly multiplying num by 10 (shifting digits left) and adding the current digit value.
		2. (int) str.charAt(i)--This part converts the character at the ith position of the string to its ASCII (numeric) value.	
      3. 48 is ASCII value of '0'*/