package Java_Programs;

//Aim: Find number of uppercase, lowercase, digits and special characters in a given string

//Through built in methods
class String_NumberOfUpperLowerDigitsSpecialMethods {

	public static void main(String[] args) {
		
		String s1 = "Find123 @The$% Count() Of Upper, Lower & Special# Chars!";
		String str=s1.replaceAll("\\s", "");
	
		int uppercase=0, lowercase=0, digits=0, specialChar=0;
		
		for(int i=0;i<str.length();i++) {
			char s2= str.charAt(i);
			
			if(Character.isUpperCase(s2)) {
				uppercase++;
			}else if(Character.isLowerCase(s2)) {
				lowercase++;
			}else if(Character.isDigit(s2)) {
				digits++;
			}else {
				specialChar++;
			}	
		}
		System.out.println("No. of uppercase: "+uppercase);
		System.out.println("No. of lowercase: "+lowercase);
		System.out.println("No. of digits: "+digits);
		System.out.println("No. of specialChar: "+specialChar);		
}}

//Through range of characters
class _03String_NumberOfUpperLowerDigitsSpecial {

	public static void main(String[] args) {
		
		String s1 = "Find123 @The$% Count() Of Upper, Lower & Special# Chars!";
		String str=s1.replaceAll("\\s", "");
	
		int uppercase=0, lowercase=0, digits=0, specialChar=0;
		
		for(int i=0;i<str.length();i++) {
			char s2= str.charAt(i);
			
			if(s2>='A' && s2<='Z') {
				uppercase++;
			}else if(s2>='a' && s2<='z') {
				lowercase++;
			}else if(s2>='1' && s2<='9') {
				digits++;
			}else {
				specialChar++;
			}	
		}
		System.out.println("No. of uppercase: "+uppercase);
		System.out.println("No. of lowercase: "+lowercase);
		System.out.println("No. of digits: "+digits);
		System.out.println("No. of specialChar: "+specialChar);		
}}

