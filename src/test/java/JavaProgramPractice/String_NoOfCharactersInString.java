package JavaProgramPractice;

//Find number of characters in string
public class String_NoOfCharactersInString {

	public static void main(String[] args) {
		
		String s1= "Count characters in this second string";
		String str= s1.replaceAll("\\s", "");
		
		System.out.println(str.length());	
	}	
}
