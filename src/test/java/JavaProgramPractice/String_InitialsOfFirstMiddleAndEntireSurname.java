package JavaProgramPractice;

//Print initials of first and middle name and entire surname.
class String_InitialsOfFirstMiddleAndEntireSurname {
	public static void main(String[] args) {

		String Str = "Mayank Singh Kushwah";

		Str = " " + Str;
		System.out.println(Str);
		int lastIndex = Str.lastIndexOf(' ');
	//	System.out.println(lastIndex);

		for (int i = 0; i < lastIndex; i++) {

			if (Str.charAt(i) == ' ') {
				System.out.print(Character.toUpperCase(Str.charAt(i + 1)) + ".");
			}
		}
		System.out.println(Str.substring(lastIndex));
	}
}

//Print only initials of string.
class String_PrintOnlyInitialsOfString {
    public static void main(String[] args) {
    	
    	String str= "Mayank Singh Kushwah";
    	String[] charStr= str.split("\\s+");
   
    	for(int i=0;i<charStr.length;i++) {
    		
    		String s1= charStr[i]; //
    		char s2=Character.toUpperCase(s1.charAt(0));
    		System.out.println(s2);
    		
   }   }
}

/*Logic:  1. split the string with white spaces.
 		  2. Use for loop to iterate each word which placed at each index.
 		  3. then find all words index 0 value.
*/		