package Java_Programs;

import java.util.Arrays;

//Check two strings are anagram or not
//Anagram- An anagram is a type of word play in which the letters of one word or phrase are rearranged to form another word or phrase. 
//Importantly, both the original and resulting strings must use exactly the same letters, with the same frequency of each letter.
//"listen" is an anagram of "silent"
//"triangle" is an anagram of "integral"
//"evil" is an anagram of "vile"

 class _06String_StringsAreAnagram {

	public static void main(String[] args) {

		String s1 = "Listen";
		String s2 = "silent ";

		String str1 = s1.replaceAll("\\s", "");
		String str2 = s2.replaceAll("\\s", "");
		boolean flag;

		if (str1.length() != str2.length()) {
			flag = false;
			//System.out.println("String are not anagram");
		} else {
			char[] c1 = str1.toLowerCase().toCharArray();
			char[] c2 = str2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			flag = Arrays.equals(c1, c2);
			//System.out.println("Strings are anagram");
		}
			System.out.println(flag);

	}
}
// One more way to check anagram strings

class _06String_StringsAreAnagram2 {
 	public static void main(String[] args) {
 		
 		String s1 = "Listen";
 		String s2 = "silenty ";
 		
 		String[] str1=s1.replaceAll("\\s+", "").toLowerCase().split("");
 		Arrays.sort(str1);        //[e, i, l, n, s, t]
 		
 		String[] str2=s2.replaceAll("\\s+", "").toLowerCase().split("");
 		Arrays.sort(str2);       //[e, i, l, n, s, t, y]
 		
 		boolean flag;
 		
 		if(str1.length!=str2.length) {
 			flag= false;
 			System.out.println("not anagram strings");
 		}else {
 			flag= Arrays.equals(str1, str2);
 			System.out.println("anagram string");
 		}
 	//	System.out.println(flag);
 		
 	}}
 



