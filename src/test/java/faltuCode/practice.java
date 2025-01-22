package faltuCode;

public class practice {

	public static void main(String[] args) {
		int num=12345;
		
//Convert the number to a string
		String a=Integer.toString(num);
		System.out.println(num);
		
//Extract the first and last characters		
		char firstDigit=a.charAt(0); 
		System.out.println("First digit: "+firstDigit);//1
		char lastDigit=a.charAt(a.length()-1);
		System.out.println("Last digit: "+lastDigit);//5
		
//Create the new string with the first and last characters swapped		
//substring(int beginIndex, int endIndex): This method returns a new string that is a substring of the original string. 
//The substring begins at the specified beginIndex and extends to the character at index endIndex - 1		
		String newString= lastDigit+a.substring(1,a.length()-1)+firstDigit;
		System.out.println("New string after swapping: "+newString);
		
//Convert the new string back to an integer		
		int result=Integer.parseInt(newString);
		System.out.println("Result: "+result);
	}}
