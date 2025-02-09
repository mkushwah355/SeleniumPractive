package JavaProgramPractice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//Find second highest element of an array with for loop.
class Arrays_SecondHighestElementOfArrayWithForLoop {
	public static void main(String[] arg) {
		int[] a = { 11, 12, 45, 9, 10, 12, 45 ,-1};//output=12

		int largest = Integer.MIN_VALUE;//-2147483648 //Initializing this variable with zero will not cover negative numbers if come in array.
		int second_largest = Integer.MIN_VALUE;//-2147483648

		for (int i = 0; i < a.length; i++) {

			if (a[i] > largest) {//11>-2147//12>11//45>12
				second_largest = largest; //-2134=-2134//11=11//11=12
				largest = a[i];//-2134=11//11=12//12=45
			} else if (a[i] > second_largest && a[i] != largest) {//
				second_largest = a[i];
				}
		}  
		System.out.println("LargestElement: "+largest);
		System.out.println("SecondHighestElement is: "+second_largest);
	}
}

//Find second highest element of an array with sort() method.
//This approach will not work if array contain duplicate numbers. Then it will not give correct second highest number through indexing.
class Arrays_SecondHighestElementOfArray {
	public static void main(String[] args) {

		int[] arr = { 11, 12, 45, 9, 10, 12 };//12

		Arrays.sort(arr);
		System.out.println("SecondHighestElement is: " + arr[arr.length - 2]);//output=12//arr[6-2]=arr[4]=12
		
	}
}
//Find second highest element of an array through collection.

class Arrays_SecondHighestElementOfArrayThroughCollection{

	public static void main(String[] args) {
		
		int[] array = { 11, 12, 45, 9, 10, 12, 45 ,-1};//output=12
		
		Set<Integer> sortedUnique= new TreeSet<Integer>();	
		
		for(int loop1:array) {
			sortedUnique.add(loop1);
		}
		
		List<Integer> list= new ArrayList<Integer>(sortedUnique);
		Integer secondHigest=0;
		
		for(Integer b:list) {
			secondHigest=list.get(list.size()-2);
			
		}
		System.out.println("SecondHighestElement through collection: "+secondHigest);
	}

}






