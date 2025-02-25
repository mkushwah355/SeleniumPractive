package Java_Programs;

//Aim: Print initials of first and middle name and entire surname.
class _13String_InitialsOfFirstMiddleAndEntireSurname {
	public static void main(String[] args) {

		String Str = "Mayank Singh Kushwah";
		Str = " " + Str;
		System.out.println(Str);

		int lastIndex = Str.lastIndexOf(' ');

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

		String str = "Mayank Singh Kushwah";
		String[] s1 = str.split("\\s+");

		for (int i = 0; i < s1.length; i++) {

			String s2 = s1[i];
			char s3 = Character.toUpperCase(s2.charAt(0));
			System.out.println(s3);

		}
	}
}

class String_PrintOnlyInitialsOfString2 {
	public static void main(String[] args) {

		String str = "Mayank Kushwah Singh";
		String[] s1 = str.split("\\s");

		String s4 = "";
		char s3 = ' ';

		for (int i = 0; i < s1.length; i++) {
			String a = s1[i];
			for (int j = 0; j <= a.length(); j++) {
				s3 = a.charAt(0);
			}
			s4 = s4 + s3;
		}
		System.out.println(s4);
	}
}

/*Logic:  1. split the string with white spaces.
 		  2. Use for loop to iterate each word which placed at each index.
 		  3. then find all words index 0 value.
*/