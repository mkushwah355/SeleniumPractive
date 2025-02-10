package JavaProgramPractice;
import java.util.ArrayList;
import java.util.Arrays;

//Aim: Compare same indexes of 2 different arrays and create new array for matching values.
public class _013Arrays_CompareSameIndexesOf2DifferentArrays {

	public static void main(String[] arg) {
		int[] a = { 1, 3, 5, 7, 9 };
		int[] b = { 1, 5, 3, 6, 9 };//output= 1,9
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {

			if (a[i] == b[i]) {

				al.add(a[i]);
			}
		}
		Object[] convertArray=al.toArray(); ///covert ArrayList into Arrays
		System.out.println(Arrays.toString(convertArray));
		/*for (Object result : convertArray) {
			
			//System.out.println(result);
		}*/
		
		
		

	}

}
