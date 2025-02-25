package Java_Programs;

//Aim: Find number of characters in string
 class _01String_NoOfCharactersInString {

	public static void main(String[] args) {
		
		String s1= "Count characters in this second string";
		String str= s1.replaceAll("\\s", "");
		
		System.out.println("Actual no. of characters: "+str.length());
		System.out.println("Actual no.of characters including whitespace: "+s1.length());
	}	
}
 
//Aim: Find number of characters in string WITHOUT length method.
 class _01String_NoOfCharactersInStringWithoutLengthMethod {

	public static void main(String[] args) {
		
		String s1= "Count characters in this second string";
		String s2= s1.replaceAll("\\s", "");
		String[] s3= s2.split("");
		
		int count=0;
		
		for(String loop1:s3) {
			count++;
		}	
		System.out.println("No.of characters WITHOUT length method: "+count); //output=33
	}	
}
 