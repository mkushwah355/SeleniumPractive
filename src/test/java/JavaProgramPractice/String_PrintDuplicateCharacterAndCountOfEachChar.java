package JavaProgramPractice;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Print duplicate and count of each duplicate character of string.
public class String_PrintDuplicateCharacterAndCountOfEachChar {
	public static void main(String[] args) {

		String str = "programming";
		char[] CharStr = str.toCharArray(); //java

		Map<Character, Integer> hm = new HashMap<Character, Integer>();

		for (Character loop1 : CharStr) {

			if (hm.containsKey(loop1)) {
				hm.put(loop1, hm.get(loop1) + 1);
			} else {
				hm.put(loop1, 1);
			}
		}

		Set<Map.Entry<Character, Integer>> entrySet = hm.entrySet();

		for (Map.Entry<Character, Integer> loop2 : entrySet) {
			if (loop2.getValue()>1) {
				System.out.println(loop2.getKey() + ":" + loop2.getValue());
			}

		}

	}
}