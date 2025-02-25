package Java_Programs;

import java.util.Arrays;

//Aim: Sort the array in ascending order(Bubble sort) without creating method.
class _001Arrays_SortArrayInAscendingOrder_BubbleSort {

	public static void main(String[] arg) {
		int[] a = { 2, 1, 4, 3, 9 }; //output= 1,2,3,4,9 (ascending order)
		int temp;

		for (int i = 0; i < a.length; i++) { //it will run from 0 to 4 index

			for (int j = i + 1; j < a.length; j++) { //it will run from i+1(i.e. 0+1=1, 1+1=1, 2+1=3) to 4 index

				if (a[i] > a[j]) {//if a[i]>b[j] then enter in this.//It will print in ascending order

					temp = a[i]; //swapping the elements with temp variable.
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		System.out.println("Ascending order of array: " + Arrays.toString(a));//printing the value of array.
		/*for(Integer result:a) {
			System.out.println("Ascending order of array: "+result);
		}*/
	}

}
//Aim: Sort the array in ascending order(Bubble sort) after creating method.

class Arrays_SortArrayInAscendingOrder_BubbleSortMethod {
	
	public static int[] bubbleSort(int[] a) {
		for (int i = 0; i < a.length; i++) {//11
			for (int j = i + 1; j < a.length; j++) {//12

				if (a[i] > a[j]) {//11>9
					a[i] = a[i] + a[j];//a[i]=20
					a[j] = a[i] - a[j];//a[j]=20-9=11
					a[i] = a[i] - a[j];//a[i]=20-11=9
				}
			}

		}
		return a;
	}

	public static void main(String[] args) {

		int[] a = { 11, 12, 45, 9, 10 };
		int[] b = bubbleSort(a);
		System.out.println(Arrays.toString(b));
	}
}
