package JavaProgramPractice;

import java.util.ArrayList;
import java.util.List;

//Aim: Java code to find number of groups of consecutive characters in a string(geeksforgggeeks-> total 3(ee, kk,ggg))
public class _12String_GroupsOfConsecutiveCharacters {

	public static void main(String[] args) {
		String str = "geeksforgggeeks";

		int count = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				count++;
				while (str.charAt(i) == str.charAt(i + 1)) {
					i++;
				}
			}
		}

		System.out.println("Number of groups of consecutive characters: " + count); // Output should be 3
	}
}

// Print all groups with the count.
class _12String_GroupsOfConsecutiveCharacters2 {

	public static void main(String[] args) {
		String str = "geeksforgggeeks";//total 3(ee, kk,ggg))  
		int count = 0;
		
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < str.length() - 1; i++) {

			if (str.charAt(i) == str.charAt(i + 1)) {
				count++;
				int start = i;
				while (str.charAt(i) == str.charAt(i + 1)) {
					i++;
				}
			list.add(str.substring(start, i + 1));

			}

		}
		   System.out.println("Total groups: " + count);
	        System.out.println("Repeated groups: " + list);
		

	}
}
