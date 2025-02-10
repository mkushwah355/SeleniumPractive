package JavaProgramPractice;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

//Aim: Remove duplicate character from a string WITHOUT Collection
class _15String_removeDuplicateCharacterWITHOUTCollection {
	public static void main(String[] args) {
		
		String s1 = "programming";
		char[] s2 = s1.toCharArray();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s2.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < s2.length; j++) {

				if (s2[i] == s2[j]) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				sb.append(s2[i]);
			}
		}
		System.out.println(sb);//output= poraming
	}
}

//Aim: Remove duplicate character from a string WITH Collection

class String_removeDuplicateCharacterWITHCollection {
	public static void main (String[]arg) {
		
		String s1 = "programming";
		char[] s2=s1.toCharArray();

		Set<Character> s3= new LinkedHashSet<Character>();
		
		for(int i=0;i<s2.length;i++) {
			s3.add(s2[i]);
		}
		System.out.println("s3: "+s3);
		
		System.out.print("UniqueElements: ");// it is without ln which will not change line.
		for(Character s4:s3) {			
			System.out.print(s4);// Without "ln", it will not change the line after the retrieval of each element.
			}				
	}

}
