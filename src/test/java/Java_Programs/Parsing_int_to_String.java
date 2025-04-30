package Java_Programs;

public class Parsing_int_to_String {

	public static void main(String[] args) {
		
		int a = 123;
		
//concatenating the int with an empty string ""
		String str1= a + "";
		System.out.println(str1+ 10);
	
//toString() method		
		String str2= Integer.toString(a);
		System.out.println(str2+ 10);
		
//valueOf method
		String str3= String.valueOf(a);
		System.out.println(str3+ 10);
		
		
		
		

	}

}
