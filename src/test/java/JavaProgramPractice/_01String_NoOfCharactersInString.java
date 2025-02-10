package JavaProgramPractice;

//Aim: Find number of characters in string
public class _01String_NoOfCharactersInString {

	public static void main(String[] args) {
		
		String s1= "Count characters in this second string";
		String str= s1.replaceAll("\\s", "");
		
		System.out.println("Actual no. of characters: "+str.length());
		System.out.println("Actual no.of characters including whitespace: "+s1.length());
	}	
}
