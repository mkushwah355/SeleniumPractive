package JavaProgramPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Print duplicate and count of each duplicate character of string.
public class String_PrintDuplicateCharacterAndCountOfEachChar {
	public static void main(String[] args) {

		String s1 = "programming";
		char[] s2 = s1.toCharArray(); //java

		Map<Character, Integer> s3 = new HashMap<Character, Integer>();

		for (Character s4 : s2) {

			if (s3.containsKey(s4)) {
				s3.put(s4, s3.get(s4) + 1);
			} else {
				s3.put(s4, 1);
			}
		}

		Set<Map.Entry<Character, Integer>> entrySet = s3.entrySet();

		for (Map.Entry<Character, Integer> s5 : entrySet) {
			if (s5.getValue()>1) {
				System.out.println(s5.getKey() + ":" + s5.getValue());
			}

		}

	}
}