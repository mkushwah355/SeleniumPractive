package Java_Programs;

//Aim: Print duplicate character of string and total number of duplicate character

public class _16String_PrintDuplicateCharacterAndItsCount {
	public static void main(String[] args) {

		String s1 = "programming";
		char[] s2 = s1.toCharArray();
		int count = 0;

		for (int i = 0; i < s2.length; i++) {
			
			for (int j = i + 1; j < s2.length; j++) {
				
				if (s2[i] == s2[j]) {
					System.out.println("Repeated character: " + s2[i]);
					count++;
				}
			}
		}
		System.out.println("Duplicate character count: " + count);
	}
}
