package JavaProgramPractice;

import java.util.Arrays;

//Sort array with Arrays.sort() method
public class Arrays_SortMethod {
    public static void main(String[] args) {
    	
    	int[] arr= {11,12,45,9,10};
//to sort array    	
    	Arrays.sort(arr);
    	System.out.println("Sorted Array: "+Arrays.toString(arr));
    	
//to store sorted array in variable.   	
    	
    	int[] sortArr= arr.clone(); //clone the original array and then sort it. 
    								//We cannot directly store Arrays.sort() in a variable bcs it returns void.
    	Arrays.sort(sortArr);
    	
    	System.out.println("Sorted Array after cloning: "+Arrays.toString(sortArr));
    	
    	
    	
    }
}
