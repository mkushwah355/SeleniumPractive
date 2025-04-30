package Java_Programs;

//Aim: String to int conversion
public class Parsing_String_to_int {	
public static void main(String[] args) {
		
	String a = "123";
			
//By Integer.parseInt(str);
	int num1 = Integer.parseInt(a);
	System.out.println(num1+ 10); 
		
//By valueOf
	int num2 = Integer.valueOf(a);  // Unboxing happens here
	System.out.println(num2+ 10);  // Output: 123
	
//If the input string represents a floating-point number but needs to be converted to an int, you can use Double.parseDouble() and cast it to an int.
	String str = "123.45";
	int num3 = (int) Double.parseDouble(str);
	System.out.println(num3+ 10);  // Output: 123 (Decimal part is truncated)	
	
}}
