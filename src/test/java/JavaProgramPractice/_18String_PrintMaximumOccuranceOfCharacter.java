package JavaProgramPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Print duplicate and count of each duplicate character of string.
//This program is same as of "String_PrintDuplicateCharacterAndCountOfEachChar"
public class _18String_PrintMaximumOccuranceOfCharacter {
	public static void main(String[] args) {

		String str = "programming";
		char[] CharStr = str.toCharArray(); //[p, r, o, g, r, a, m, m, i, n, g]

		Map<Character, Integer> hm = new HashMap<Character, Integer>();

		for (Character loop1 : CharStr) {

			if (hm.containsKey(loop1)) {
				hm.put(loop1, hm.get(loop1) + 1);
			} else {
				hm.put(loop1, 1);
			}
		}
		//System.out.println(hm);//{p=1, a=1, r=2, g=2, i=1, m=2, n=1, o=1}
		int maxCount = 0;

		Set<Map.Entry<Character, Integer>> entrySet = hm.entrySet();

		for (Map.Entry<Character, Integer> loop2 : entrySet) {

			if (maxCount < loop2.getValue()) { //0<1 //1<2 //2<no	//maxCount=2
				maxCount = loop2.getValue(); //0=1 //1=2 //will not come inside if condition
			}
		}
		System.out.println("maxCount value from loop2: "+maxCount);//maxCount=2
		
		System.out.print("Maximum repeated characters are: ");
		for (Map.Entry<Character, Integer> loop3 : entrySet) {

			if (maxCount == loop3.getValue()) { //maxCount=2 is coming from above loop2	
												//if maxCount=2 == {p=1, a=1, r=2, g=2, i=1, m=2, n=1, o=1} then print Key
				System.out.print(loop3.getKey() + " ");
			}
		}
	}
}