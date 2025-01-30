package faltuCode;

import java.util.HashSet;
import java.util.*;

//Find initials of string
public class practice2 {
	public static void main(String[] args) {
		allZerosToRight();
	}

	public static void allZerosToRight() {

		int[] num = { 1, 0, 5, 2, 9, 3, 0, 4, 7, 0, 5, 6, 0, 1 };
	

		ArrayList<Integer> numlist = new ArrayList<>();

		for (int i = 0; i < num.length; i++) {
			if (num[i] != 0) {
				numlist.add(num[i]);
			}
		}

		for (int i = 0; i < num.length; i++)
			if (num[i] == 0) {
				numlist.add(num[i]);
			}

		System.out.println(numlist);
	}

}

/*Logic:  1. split the string with white spaces.
 		  2. Use for loop to iterate each word which placed on each index.
 		  3. then find all words index 0 value.
*/