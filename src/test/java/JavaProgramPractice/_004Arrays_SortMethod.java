package JavaProgramPractice;
import java.util.Arrays;

//Aim: Sort array with Arrays.sort() method.
//without creating method
class _004Arrays_SortMethod {
	
    public static void main(String[] args) {
    	
    	int[] arr= {11,12,45,9,10};
   	
    	Arrays.sort(arr);
    	//System.out.println("Sorted Array: "+Arrays.toString(arr));
    	
//we cannot store Arrays.sort() in any variable as its return type is void.
//So, in order to store in variable, we need to clone original array and then sort it	  	
    	
    	int[] sortArr= arr.clone(); 
    	Arrays.sort(sortArr);    	
    	System.out.println("Sorted Array after cloning(withoutMethod): "+Arrays.toString(sortArr));   	
    }
}

//Sort array with Arrays.sort() method
//after creating method.
class Arrays_SortMethodAfterCreatingMethod {
	
	int[] array = { 11, 12, 45, 9, 10 };

	public int[] sortMethod(int[] a) {

		Arrays.sort(a);//to sort array 
		//System.out.println("Sorted Array: " + Arrays.toString(a));
		
		//we cannot store Arrays.sort() in any variable as its return type is void.
		//So, in order to store in variable, we need to clone original array and then sort it		    	
		int[] sortArr = a.clone();
		Arrays.sort(sortArr);
		return sortArr;
	}
	
	public static void main(String[] args) {
		
		Arrays_SortMethodAfterCreatingMethod obj = new Arrays_SortMethodAfterCreatingMethod();
		int[] result = obj.sortMethod(obj.array);
		System.out.println("Sorted Array after cloning(withMethod): " + Arrays.toString(result));
	}
}
