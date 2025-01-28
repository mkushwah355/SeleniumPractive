package faltuCode;

import java.util.HashSet;
import java.util.*;

//Find initials of string
public class practice2 {
	public static void main(String[] args) {
		
		String str= "Mayank Singh Kushwah";
				
		String spaceStr= " "+str;
		System.out.println(spaceStr);
		int lastIndex= spaceStr.lastIndexOf(' ');
		
		for(int i=0;i<lastIndex;i++) {
			if(spaceStr.charAt(i)==' ') {
				System.out.print(spaceStr.charAt(i+1)+".");
			}
		}
		System.out.println(spaceStr.substring(lastIndex));
		
	}
		

	}


/*Logic:  1. split the string with white spaces.
 		  2. Use for loop to iterate each word which placed on each index.
 		  3. then find all words index 0 value.
*/