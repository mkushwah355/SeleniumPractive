package Java_Programs;

//Aim: Java program to convert string to integer without using inbuild(integer.parseInt)
class _04String_StringToIntegerWithoutParsing {

	public static void main(String[] args) {
		String str = "123";

		int num = 0;

		for (int i = 0; i < str.length(); i++) {

			num = num * 10 + ((int) str.charAt(i) - 48); //0*10+(49-48)=1, 1*10+(50-48)=12, 12*10(51-48)=123
		}

		System.out.println("String to int: "+num + 10); // Output should be 133
	}
}

/*Logic: 1. The number is formed by repeatedly multiplying num by 10 (shifting digits left) and adding the current digit value.
		2. (int) str.charAt(i)--This part converts the character at the ith position of the string to its ASCII (numeric) value.	
        3. 48 is ASCII value of '0'*/

//convert String into int using parse method
 class StringToIntExample {
    public static void main(String[] args) {
        String str = "123";
        
        // Convert the string to an integer
        int num = Integer.parseInt(str);
        
        // Print the result
        System.out.println("Converted integer: " + (num+10)); // Output: 133
    }
}
