package JavaProgramPractice;
import java.util.Arrays;

//Aim: Sort the array in ascending order(Bubble sort)
public class Arrays_SortArrayInAscendingOrder_BubbleSort {

	public static void main(String[] arg) {
		int[] a = { 2, 1, 4, 3, 9 }; //output= 1,2,3,4,9 (ascending order)
		int temp;

		for (int i = 0; i < a.length; i++) { //it will run from 0 to 4 index

			for (int j = i + 1; j < a.length; j++) { //it will run from i+1(i.e. 0+1=1, 1+1=1, 2+1=3) to 4 index

				if (a[i] > a[j]) {//if a[i]>b[j] then enter in this.//It will print in ascending order

					temp=a[i];   //swapping the elements with temp variable.
					a[i] = a[j];
					a[j]= temp;
					
				}
			}
		}
			System.out.println("Ascending order of array: "+Arrays.toString(a));//printing the value of array.
			/*for(Integer result:a) {
				System.out.println("Ascending order of array: "+result);
			}*/
	}

}
