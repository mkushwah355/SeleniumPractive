package Java_Programs;
import java.util.Arrays;

//Aim: Sort string in alphabetical order with String byte method
class _20String_Sort_Alphabetical_ByteMethod{	
	public static void main (String[] arg) {
		
		String str= "Mayank";
		byte[]	str1= str.toLowerCase().getBytes();
		
		Arrays.sort(str1);
		String result= new String(str1);
		
		System.out.println(result);
		
	}	
}
/*
The getBytes() method converts the string (in this case,"mayank") into a sequence of bytes.It is a method of the String class, not directly a method of bytes. 
It is used to convert a String into an array of bytes (byte[]). Each character in the string is encoded into its corresponding byte representation based on the default or specified character encoding.
When you call str.getBytes(), Java encodes the string str into bytes using the platform's default character set (usually UTF-8 or ASCII, depending on your system).
Each character in the string is mapped to its ASCII (or UTF-8, depending on default encoding) byte value.
109 represents 'm', 97 represents 'a',121 represents 'y', and so on
*/
