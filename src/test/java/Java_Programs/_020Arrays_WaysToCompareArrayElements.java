package Java_Programs;

import java.util.Arrays;
//Aim: Ways to compare array elements
public class _020Arrays_WaysToCompareArrayElements {

	public static void main(String[] args) {
//Arrays.equals(a1, b1) method		
		int[] a1 = {1, 2, 3};
		int[] b1 = {1, 2, 3};
		System.out.println(Arrays.equals(a1, b1)); // Output: true
		
//comparing multidimensional (nested) arrays		
		int[][] a2 = {{1, 2}, {3, 4}};
		int[][] b2 = {{1, 2}, {3, 4}};
		System.out.println(Arrays.deepEquals(a2, b2)); // Output: true
		
//Convert arrays to strings and compare the resulting strings.		
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3};
		System.out.println(Arrays.toString(arr1).equals(Arrays.toString(arr2))); // Output: true	

	}

}
