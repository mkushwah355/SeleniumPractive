package Java_Programs;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

//Aim: Remove duplicate character from a string WITHOUT Collection
class _15String_removeDuplicateCharacterWITHOUTCollection {
	public static void main(String[] args) {
		
		String s1 = "programming";
		char[] s2 = s1.toCharArray();
	//	String[] s2=s1.split("");// split will also work to split string into array.
		
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
		String[] s2= s1.split("");
		
		Set<String> set= new LinkedHashSet<String>();
		
		for(String loop1:s2) {
			set.add(loop1);
		}		
		System.out.println(set);	
		
		for(String loop2: set) {
			System.out.print(loop2);
		}		
	}
}
