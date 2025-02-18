package JavaProgramPractice;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

//Aim: Remove duplicate words from string
class _14String_removeDuplicateWord {
	public static void main(String[] args) {

		String str = "Goodbye bye bye world world world\n" + "Sam went went to to to his business\n"
				+ "Reya is is the the best player in eye eye game\n" + "in inthe\n" + "Hello hello Ab aB";
		String[] charStr = str.split("\\s+");

		Set<String> LHS = new LinkedHashSet<String>();

		for (String loop1 : charStr) {

			LHS.add(loop1.toLowerCase());
		}
		System.out.println(LHS);

		for (String loop2 : LHS) {
			System.out.print(loop2 + " ");
		}

	}
}

//Aim: Remove duplicate words from string(it will check the substring as well)
class _14String_removeDuplicateWord2 {
	public static void main(String[] args) {
		String str = "Goodbye bye bye world world world\n" + "Sam went went to to to his business\n"
				+ "Reya is is the the best player in eye eye game\n" + "in inthe\n" + "Hello hello Ab aB";
		String s1 = str.toLowerCase();
		String[] s2 = s1.split("\\s+");

		Map<String, String> map = new LinkedHashMap<>();

		for (String loop1 : s2) {
			boolean flag = false;

			for (String loop2 : map.keySet()) {
				if (loop1.contains(loop2) || loop2.contains(loop1)) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				map.put(loop1, loop1);
			}
		}
		//System.out.println(map);
		for (Map.Entry<String, String> loop3 : map.entrySet()) {
			System.out.print(loop3.getKey() + " ");
		}
	}
}
