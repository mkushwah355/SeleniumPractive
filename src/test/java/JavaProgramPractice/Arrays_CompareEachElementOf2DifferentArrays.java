package JavaProgramPractice;

import java.util.ArrayList;
import java.util.Arrays;

//Aim: Compare each element of 2 different arrays and create new array for matching values.
public class Arrays_CompareEachElementOf2DifferentArrays {

	public static void main(String[] arg) {
		int[] a = { 1, 3, 5, 7, 9 };
		int[] b = { 1, 5, 3, 6, 9 };//output= 1,3,5,9

		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {

					al.add(a[i]);
					//break;
				}
			}
		}
		System.out.println(al);
		Object[] convertArray = al.toArray(); ///covert ArrayList to Arrays
		System.out.println(Arrays.toString(convertArray));
	}
}
/*for (Object result : al) {
	
	System.out.println(result);
}*/

//Note: If any array have any duplicate element then it will get printed in output if not used "break" statement.
//using "break" statement, will help to remove duplicate elements in output.
/*		int[] a = { 1, 3, 5, 7, 9 };
		int[] b = { 1, 5, 3, 6, 9, 3};//output= 1,3,3,5,9 if "break" statement not used inside inner loop.
*/
