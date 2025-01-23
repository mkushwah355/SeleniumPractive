package JavaProgramPractice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

//Remove duplicate words from string
public class String_removeDuplicateWord {
	public static void main(String[] args) {

		String s1 = "programming  is good always good";
		String[] s2 = s1.split("\\s+");
		System.out.println(Arrays.toString(s2));

		Set<String> s3 = new LinkedHashSet<String>();

		for (String s4 : s2) {
			s3.add(s4);
		}
		System.out.println(s3);

		for (String s5 : s3) {
			System.out.print(s5 + " ");
		}
	}
}