package JavaProgramPractice;

import java.util.Arrays;

//Sort Array in Ascending order(Bubble sort) without temp variable.
public class Arrays_SortArrayInDesendingOrderWithoutTempVariable {

	public static void main(String[] arg) {

		int[] a = { 2, 1, 4, 3, 9 }; //output= 1,2,3,4,9 (ascending order)

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {		//It will print in descending order
					a[i] = a[i] + a[j];// swapping without temp variable
					a[j] = a[i] - a[j];
					a[i] = a[i] - a[j];
				}
			}
		}
		System.out.println("Descending order of array: "+Arrays.toString(a));
	}

}